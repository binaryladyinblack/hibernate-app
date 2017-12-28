package model;

import javax.persistence.*;

@Entity
//@SecondaryTable(name = "ADDRESS_TABLE")
public class Supplier extends Company {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int dbID;

    public String bankAccountNumber;

//    public String companyName;

//    @Column(table = "ADDRESS_TABLE")
//    public String street;
//    @Column(table = "ADDRESS_TABLE")
//    public String city;
//    @Column(table = "ADDRESS_TABLE")
//    public String zipCode;


//    @Embedded
//    public model.Address address;

//    @OneToMany(cascade = CascadeType.PERSIST)
////    @JoinColumn(name = "SUPPLIER_FK")
//    public Set<model.Product> products = new HashSet<>();

    public Supplier() {
    }

    public Supplier(String companyName, String street, String city, String zipCode, String bankAccountNumber) {
        super(companyName, street, city, zipCode);
        this.bankAccountNumber = bankAccountNumber;
    }

//    public void addProducts(model.Product product) {
//        this.products.add(product);
//    }
//
//    public Set<model.Product> getProducts() {
//        return products;
//    }
}
