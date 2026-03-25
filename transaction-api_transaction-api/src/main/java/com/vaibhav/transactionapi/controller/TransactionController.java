package com.vaibhav.transactionapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vaibhav.transactionapi.dto.ApiResponse;
import com.vaibhav.transactionapi.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ApiResponse transfer(
            @RequestParam Long senderId,
            @RequestParam Long receiverId,
            @RequestParam double amount) {

        return transactionService.transfer(senderId, receiverId, amount);
    }
}