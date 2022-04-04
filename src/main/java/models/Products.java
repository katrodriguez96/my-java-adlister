package models;

import java.util.List;

public interface Products {
    List<Product> all(); // get all products and return as a list (can poly into an arraylist)

    void insert(Product productToInsert); // insert into list
}
