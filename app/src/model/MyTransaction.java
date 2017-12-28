package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Iterator;
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

    public StringBuilder getProducts() {
        StringBuilder result = new StringBuilder();
        Iterator itr = products.iterator();
        while(itr.hasNext()){
            Product elem = (Product) itr.next();
            result.append(elem.getProductName());
            result.append(", ");
        }
        return result;
    }

    public Integer getTransactionNumber() {
        return transactionNumber;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void addProduct(model.Product product) {
        this.products.add(product);
    }

    public void setTransactionNumber(Integer transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
