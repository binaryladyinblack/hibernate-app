import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dbID;

    public String productName;
    public Integer unitsOnStock;

    @ManyToOne
    public Company company;

    @ManyToOne
    public Category category;

    @ManyToMany (cascade = CascadeType.PERSIST)
    public Set<MyTransaction> transactions = new HashSet<>();

    public Product() {
    }

    public Product(String productName, Integer unitsOnStock) {
        this.productName = productName;
        this.unitsOnStock = unitsOnStock;
    }

    public void setSupplier(Company supplier) {
        this.company = supplier;
        supplier.addProducts(this);
    }

    public void setCategory(Category category) {
        this.category = category;
        category.addProducts(this);
    }

    public void addTransaction(MyTransaction transaction) {
        this.transactions.add(transaction);
        transaction.products.add(this);
        this.unitsOnStock -= transaction.quantity;
    }

    public Set<MyTransaction> getTransactions() {
        return transactions;
    }
}
