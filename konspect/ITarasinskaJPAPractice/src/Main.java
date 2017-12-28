import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Set;


public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
//            Transaction tx = session.beginTransaction();
//            Product product = new Product("product4", 4);
//            Supplier supplier = new Supplier("company4", "street4", "city4");
////            product.setSupplier(supplier);
//            supplier.addProducts(product);
//            session.save(product);
//            session.save(supplier);
//            tx.commit();


//            Transaction tx = session.beginTransaction();
//            Product product1 = new Product("product6", 4);
//            Product product2 = new Product("product7", 4);
//            Product product3 = new Product("product8", 4);
//            Product product4 = new Product("product9", 4);
//            Supplier supplier1 = new Supplier("company6", "street6", "city6");
//            Supplier supplier2 = new Supplier("company7", "street7", "city7");
//            Supplier supplier3 = new Supplier("company8", "street8", "city8");
//            Supplier supplier4 = new Supplier("company9", "street9", "city9");
//
//            Category category = new Category("meat");
//            product.setCategory(category);
//            session.save(product1);
//            session.save(product2);
//            session.save(product3);
//            session.save(product4);
//            session.save(category);
//            session.save(supplier1);
//            session.save(supplier2);
//            session.save(supplier3);
//            session.save(supplier4);
//
//            tx.commit();

//            Transaction tx = session.beginTransaction();
//            Product product1 = session.get(Product.class, 13);
//            Product product2 = session.get(Product.class, 14);
//            Product product3 = session.get(Product.class, 15);
//            Product product4 = session.get(Product.class, 16);
//
//            Supplier supplier1 = session.get(Supplier.class, 17);
//
//            product1.setSupplier(supplier1);
//            product2.setSupplier(supplier1);
//            product3.setSupplier(supplier1);
//            product4.setSupplier(supplier1);
//
//            session.save(product1);
//            session.save(product2);
//            session.save(product3);
//            session.save(product4);
//
//            tx.commit();

//            Transaction tx = session.beginTransaction();
//
//            Supplier supplier1 = session.get(Supplier.class, 17);
//            Set<Product> products = supplier1.getProducts();
//
//            for (Product p: products) {
//                System.out.println(p.productName);
//            }
//
//            tx.commit();


//            org.hibernate.Transaction tx = session.beginTransaction();
//
//            Product product1 = new Product("product10", 10);
//            Product product2 = new Product("product11", 15);
//            MyTransaction transaction1 = new MyTransaction(1, 2);
//            MyTransaction transaction2 = new MyTransaction(2, 3);
//
//            product1.addTransaction(transaction1);
//            product1.addTransaction(transaction2);
//            product2.addTransaction(transaction1);
//            product2.addTransaction(transaction2);
//
//            session.save(product1);
//            session.save(product2);
//            session.save(transaction1);
//            session.save(transaction2);
//
//            tx.commit();


//            Transaction tx = session.beginTransaction();
//
//            MyTransaction transaction = session.get(MyTransaction.class, 27);
//            Set<Product> products = transaction.getProducts();
//
//            for (Product p: products) {
//                System.out.println(p.productName);
//            }
//
//            tx.commit();


//            Transaction tx = session.beginTransaction();
//            Product product = session.get(Product.class, 25);
//            Set<MyTransaction> transactions = product.getTransactions();
//
//            for (MyTransaction t: transactions) {
//                System.out.println(t.transactionNumber);
//            }
//
//            tx.commit();

        } finally {
            session.close();
        }
    }
}