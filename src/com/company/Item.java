package com.company;

public class Item
{
    private String name;
    private float price = 0;

    public Item(String name, float price)
    {
        if (price < 0) setPrice(0);
        else setPrice(price);
        setName(name);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public float getPrice()
    {
        return this.price;
    }

    public void raiseItemPrice (float percent)
    {
        this.price += this.price * (percent/100);
    }

    public void cutItemPrice (float percent)
    {
        this.price -= this.price * (percent/100);
        if (this.price < 0 && percent > 100){
            this.price = 0;
        }
    }
}
