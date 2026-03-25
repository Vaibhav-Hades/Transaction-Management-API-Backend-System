package com.vaibhav.transactionapi.dto;

public class ApiResponse {

    private String status;
    private String message;
    private double senderBalance;
    private double receiverBalance;

    public ApiResponse(String status, String message, double senderBalance, double receiverBalance) {
        this.status = status;
        this.message = message;
        this.senderBalance = senderBalance;
        this.receiverBalance = receiverBalance;
    }

    public String getStatus() { return status; }
    public String getMessage() { return message; }
    public double getSenderBalance() { return senderBalance; }
    public double getReceiverBalance() { return receiverBalance; }
}