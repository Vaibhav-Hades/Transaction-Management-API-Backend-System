package com.vaibhav.transactionapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vaibhav.transactionapi.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}