package com.vaibhav.transactionapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long senderId;
    private Long receiverId;
    private double amount;

    // getters & setters

    public Long getId() { return id; }

    public Long getSenderId() { return senderId; }

    public void setSenderId(Long senderId) { this.senderId = senderId; }

    public Long getReceiverId() { return receiverId; }

    public void setReceiverId(Long receiverId) { this.receiverId = receiverId; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }
}