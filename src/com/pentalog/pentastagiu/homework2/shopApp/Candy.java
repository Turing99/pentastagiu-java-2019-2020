package com.pentalog.pentastagiu.homework2.shopApp;

public class Candy extends Products{
	
	private int quantity;

    public Candy(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}