package com.company;

public class Main {

    public static void main(String[] args) {
        Cart cart1 = new Cart();
        cart1.addItem("item1", 40);
        cart1.addItem("item2" , 50);
        cart1.addItem("item3", 80);
        cart1.addItem("item4",15);
        cart1.addItem("item5" , 60);
        cart1.addItem("item6", 150);

        cart1.removeItem("item6" , 150);
        cart1.countItemPrice();
        cart1.raiseItemPrice(15);
        cart1.cutItemPrice(30);
    }
}
