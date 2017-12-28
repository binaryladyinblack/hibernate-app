package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dbID;

    public String name;

    @OneToMany
    public List<Product> products = new ArrayList<>();

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public void addProducts(Product product) {
        this.products.add(product);
    }

    public String getName() {
        if(name == null)
            return "not set yet";
        else return name;
    }

    public int getDbID() {
        return dbID;
    }
}
