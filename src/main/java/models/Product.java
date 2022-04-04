package models;

import java.io.Serializable;

public class Product implements Serializable {
    // properties
    private String name;
    private double price;

    // default (blank) constructor
    public Product() {}
    // custom constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
