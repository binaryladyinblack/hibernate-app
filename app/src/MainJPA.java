import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Set;

public class MainJPA {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");
        EntityManager em = emf.createEntityManager();
        EntityTransaction etx = em.getTransaction();

        etx.begin();

//        model.Category category = new model.Category("dairy");
//        model.Product product = new model.Product("product12", 4);
//        product.setCategory(category);
//        em.persist(product);
//        em.persist(category);

//        model.Product product20 = new model.Product("product20", 5);
//        model.Product product21 = new model.Product("product21", 5);
//        model.Product product22 = new model.Product("product22", 5);
//        model.Product product23 = new model.Product("product23", 5);
//
//        model.Supplier supplier20 = new model.Supplier("company20", "street20", "city20");
//        model.Supplier supplier21 = new model.Supplier("company21", "street21", "city21");
//        model.Supplier supplier22 = new model.Supplier("company22", "street22", "city22");
//        model.Supplier supplier23 = new model.Supplier("company23", "street23", "city23");
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

//        model.Product product20 = em.find(model.Product.class, 31);
//        model.Product product21 = em.find(model.Product.class, 32);
//        model.Product product22 = em.find(model.Product.class, 33);
//
//        model.Supplier supplier20 = em.find(model.Supplier.class, 35);
//
//        product20.setSupplier(supplier20);
//        product21.setSupplier(supplier20);
//        product22.setSupplier(supplier20);
//
//        em.persist(product20);
//        em.persist(product21);
//        em.persist(product22);

//        model.Supplier supplier = em.find(model.Supplier.class, 35);
//        Set<model.Product> products = supplier.getProducts();
//
//        for (model.Product p: products) {
//            System.out.println(p.productName);
//        }


//        model.Product product = em.find(model.Product.class, 31);
//        System.out.println(product.supplier.companyName);


//        model.Product product30 = new model.Product("product30", 6);
//        model.Supplier supplier30 = new model.Supplier("company30", "street30", "city30");
//        product30.setSupplier(supplier30);
//
//        em.persist(supplier30);

//        model.Product product32 = new model.Product("product32", 10);
//        model.MyTransaction transaction = new model.MyTransaction(4, 2);
//
//        product32.addTransaction(transaction);
//
//        em.persist(product32);

        etx.commit();
        em.close();
    }
}