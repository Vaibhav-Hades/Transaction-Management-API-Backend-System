package com.vaibhav.transactionapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.transactionapi.dto.ApiResponse;
import com.vaibhav.transactionapi.model.Transaction;
import com.vaibhav.transactionapi.model.User;
import com.vaibhav.transactionapi.repository.TransactionRepository;
import com.vaibhav.transactionapi.repository.UserRepository;

@Service
public class TransactionService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public ApiResponse transfer(Long senderId, Long receiverId, double amount) {

        User sender = userRepository.findById(senderId).orElse(null);
        User receiver = userRepository.findById(receiverId).orElse(null);

        if (sender == null || receiver == null) {
            return new ApiResponse("ERROR", "User not found", 0, 0);
        }

        if (sender.getBalance() < amount) {
            return new ApiResponse("FAILED", "Insufficient balance", 0, 0);
        }

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        userRepository.save(sender);
        userRepository.save(receiver);

        Transaction t = new Transaction();
        t.setSenderId(senderId);
        t.setReceiverId(receiverId);
        t.setAmount(amount);

        transactionRepository.save(t);

        return new ApiResponse(
                "SUCCESS",
                "Transaction successful",
                sender.getBalance(),
                receiver.getBalance()
        );
    }
}