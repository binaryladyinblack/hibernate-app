package model;

import javax.persistence.Entity;

@Entity
public class Customer extends Company {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int dbID;

    public Double discount;

    public Customer() {
    }

    public Customer(String companyName, String street, String city, String zipCode, Double discount) {
        super(companyName, street, city, zipCode);
        this.discount = discount;
    }
}
