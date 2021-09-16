package com.company;

import java.security.PublicKey;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> cart;

    Cart()
    {
        cart = new ArrayList<>();
    }
    public void addItem(String name, float price)
    {
        this.cart.add(new Item(name, price));
    }
    public void removeItem(String name, float price)
    {
        for(int i=0; i<cart.size(); i++)
        {
            if (cart.get(i).getName()==name)
            {
                cart.remove(i);
            }
        }
        System.out.println(name);
    }
    public void countItemPrice()
    {
        float  sum = 0;
        for(int i=0; i<cart.size(); i++)
        {
            sum += cart.get(i).getPrice();
        }
        System.out.println("Total sum = " + sum);
    }
    public void raiseItemPrice(float percent)
    {
        float sum =0;

        for(int i = 0; i < cart.size();i++)
        {
            cart.get(i).raiseItemPrice(percent);
            sum += cart.get(i).getPrice();
        }
        System.out.println("Sum up = " + sum);
    }
    public void cutItemPrice(float percent)
    {
        float sum =0;

        for(int i = 0; i < cart.size();i++)
        {
            cart.get(i).cutItemPrice(percent);
            sum += cart.get(i).getPrice();
        }
        System.out.println("Sum down = " + sum);
    }
}
