package com.lambdaschool.piggybank.models;

// coinid, name, nameplural, value, quantity

import javax.persistence.*;

@Entity // a table in the DB (turns code into BEAN)
@Table(name = "coins")
public class Coin
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // use whatever the DB wants to use to assign the id
    private long coinid;
    private String name;
    private String nameplurl;
    private double value;
    private long quantity;

    // constructors
    public Coin(
        String name,
        String nameplurl,
        double value,
        long quantity)
    {
        this.name = name;
        this.nameplurl = nameplurl;
        this.value = value;
        this.quantity = quantity;
    }

    public Coin()
    {
    }

    // getters and setters
    public long getCoinid()
    {
        return coinid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNameplurl()
    {
        return nameplurl;
    }

    public void setNameplurl(String nameplurl)
    {
        this.nameplurl = nameplurl;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public long getQuantity()
    {
        return quantity;
    }

    public void setQuantity(long quantity)
    {
        this.quantity = quantity;
    }

    // generate 2 string method for employee
    @Override
    public String toString()
    {
        return "Coin{" +
            "coinid=" + coinid +
            ", name='" + name + '\'' +
            ", nameplurl='" + nameplurl + '\'' +
            ", value='" + value + '\'' +
            ", quantity=" + quantity +
            '}';
    }
}

// NEXT: connect to java (repositories) and do something with it (controllers)
