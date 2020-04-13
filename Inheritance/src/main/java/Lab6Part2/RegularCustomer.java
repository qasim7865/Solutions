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
public class RegularCustomer extends Customer{
    private int discount;

    public RegularCustomer(int discount, int ID, String name, char gender) {
        super(ID, name, gender);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "RegularCustomer{" + "discount=" + discount + '}';
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
    
}
