package models;

import java.util.ArrayList;
import java.util.List;

public class ListProductsDao implements Products{
    private List<Product> products = new ArrayList<>(); // an arraylist to dummy what will eventually be a database we're talking to

    // constructor
    // whenever this app gets going, i want three products to start with every time. use the 'insert' method and makes these products
    public ListProductsDao() {
        insert(new Product("pressure washer", 299.99));
        insert(new Product("nailgun", 99.45));
        insert(new Product("white trim baseboard", 10.50));
    }

    public List<Product> all() {
        return this.products;
    }

    public void insert(Product productToInsert) {
        this.products.add(productToInsert);
    }
}
