package com.vaibhav.transactionapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private double balance;

    // 👇 ADD THESE MANUALLY
    public Long getId() { return id; }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public double getBalance() { return balance; }

    public void setName(String name) { this.name = name; }

    public void setEmail(String email) { this.email = email; }

    public void setBalance(double balance) { this.balance = balance; }
}