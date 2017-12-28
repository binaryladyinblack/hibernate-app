package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MyTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dbID;

    public Integer transactionNumber;
    public Integer quantity;

//    @ManyToMany (cascade = CascadeType.PERSIST)
    @ManyToMany
    public Set<Product> products = new HashSet<>();

    public MyTransaction() {
    }

    public MyTransaction(Integer transactionNumber, Integer quantity) {
        this.transactionNumber = transactionNumber;
        this.quantity = quantity;
    }

    public Set<Product> getProducts() {
        return products;
    }
}
