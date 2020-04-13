/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6Part2;

/**
 *
 * @author princ
 */
public class Account {
    private int id;
    private Customer customer;
    private double balance; 

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", customer=" + customer + ", balance=" + balance + '}';
    }
    
    public String getCustomerName(){
        return customer.getName();
    }
    
    public Account deposit(double amount){
        this.balance=this.balance+amount;
        return this;
    }
    
    public Account withDraw(double amount){
        if (this.balance>=amount){
            this.balance=this.balance-amount;
        }else{
            System.out.println("Invalid amount");
        }
        return this;
    }
}
