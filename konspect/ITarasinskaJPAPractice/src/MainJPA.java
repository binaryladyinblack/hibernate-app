import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Set;

public class MainJPA {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");
        EntityManager em = emf.createEntityManager();
        EntityTransaction etx = em.getTransaction();

        etx.begin();

//        Category category = new Category("dairy");
//        Product product = new Product("product12", 4);
//        product.setCategory(category);
//        em.persist(product);
//        em.persist(category);

//        Product product20 = new Product("product20", 5);
//        Product product21 = new Product("product21", 5);
//        Product product22 = new Product("product22", 5);
//        Product product23 = new Product("product23", 5);
//
//        Supplier supplier20 = new Supplier("company20", "street20", "city20");
//        Supplier supplier21 = new Supplier("company21", "street21", "city21");
//        Supplier supplier22 = new Supplier("company22", "street22", "city22");
//        Supplier supplier23 = new Supplier("company23", "street23", "city23");
//
//        em.persist(product20);
//        em.persist(product21);
//        em.persist(product22);
//        em.persist(product23);
//
//        em.persist(supplier20);
//        em.persist(supplier21);
//        em.persist(supplier22);
//        em.persist(supplier23);

//        Product product20 = em.find(Product.class, 31);
//        Product product21 = em.find(Product.class, 32);
//        Product product22 = em.find(Product.class, 33);
//
//        Supplier supplier20 = em.find(Supplier.class, 35);
//
//        product20.setSupplier(supplier20);
//        product21.setSupplier(supplier20);
//        product22.setSupplier(supplier20);
//
//        em.persist(product20);
//        em.persist(product21);
//        em.persist(product22);

//        Supplier supplier = em.find(Supplier.class, 35);
//        Set<Product> products = supplier.getProducts();
//
//        for (Product p: products) {
//            System.out.println(p.productName);
//        }


//        Product product = em.find(Product.class, 31);
//        System.out.println(product.supplier.companyName);


//        Product product30 = new Product("product30", 6);
//        Supplier supplier30 = new Supplier("company30", "street30", "city30");
//        product30.setSupplier(supplier30);
//
//        em.persist(supplier30);

//        Product product32 = new Product("product32", 10);
//        MyTransaction transaction = new MyTransaction(4, 2);
//
//        product32.addTransaction(transaction);
//
//        em.persist(product32);

        etx.commit();
        em.close();
    }
}