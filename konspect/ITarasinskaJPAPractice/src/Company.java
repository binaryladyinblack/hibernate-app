import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy= InheritanceType.JOINED)
//Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dbID;

    public String companyName;
    public String street;
    public String city;
    public String zipCode;

    @OneToMany(cascade = CascadeType.PERSIST)
    public Set<Product> products = new HashSet<>();

    public Company() {
    }

    public Company(String companyName, String street, String city, String zipCode) {
        this.companyName = companyName;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public void addProducts(Product product) {
        this.products.add(product);
    }

    public Set<Product> getProducts() {
        return products;
    }
}
