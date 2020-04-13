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
public class Invoice {
    private int ID;
    private RegularCustomer customer;
    private double amount;

    public Invoice(int ID, RegularCustomer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public RegularCustomer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice{" + "ID=" + ID + ", customer=" + customer + ", amount=" + amount + '}';
    }
    
    public double getAmountAfterDiscount(){
        return amount = amount - customer.getDiscount();
    }
    
    public String getCustomerName(){
        return customer.getName();
    }
}
