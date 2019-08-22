/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dto;

/**
 *
 * @author Nethadun PC
 */
public class MakePaymentDTO {
    private String payment_Id;
    private String book_Id;
    private double amount;
    private int discount;
    private double balance;

    public MakePaymentDTO() {
    }

    public MakePaymentDTO(String payment_Id, String book_Id, double amount, int discount, double balance) {
        this.payment_Id = payment_Id;
        this.book_Id = book_Id;
        this.amount = amount;
        this.discount = discount;
        this.balance = balance;
    }

    public String getPayment_Id() {
        return payment_Id;
    }

    public void setPayment_Id(String payment_Id) {
        this.payment_Id = payment_Id;
    }

    public String getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(String book_Id) {
        this.book_Id = book_Id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
