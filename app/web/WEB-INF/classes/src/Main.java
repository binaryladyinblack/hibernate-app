import org.hibernate.*;
import org.hibernate.cfg.Configuration;

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
//            model.Product product = new model.Product("product4", 4);
//            model.Supplier supplier = new model.Supplier("company4", "street4", "city4");
////            product.setSupplier(supplier);
//            supplier.addProducts(product);
//            session.save(product);
//            session.save(supplier);
//            tx.commit();


//            Transaction tx = session.beginTransaction();
//            model.Product product1 = new model.Product("product6", 4);
//            model.Product product2 = new model.Product("product7", 4);
//            model.Product product3 = new model.Product("product8", 4);
//            model.Product product4 = new model.Product("product9", 4);
//            model.Supplier supplier1 = new model.Supplier("company6", "street6", "city6");
//            model.Supplier supplier2 = new model.Supplier("company7", "street7", "city7");
//            model.Supplier supplier3 = new model.Supplier("company8", "street8", "city8");
//            model.Supplier supplier4 = new model.Supplier("company9", "street9", "city9");
//
//            model.Category category = new model.Category("meat");
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
//            model.Product product1 = session.get(model.Product.class, 13);
//            model.Product product2 = session.get(model.Product.class, 14);
//            model.Product product3 = session.get(model.Product.class, 15);
//            model.Product product4 = session.get(model.Product.class, 16);
//
//            model.Supplier supplier1 = session.get(model.Supplier.class, 17);
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
//            model.Supplier supplier1 = session.get(model.Supplier.class, 17);
//            Set<model.Product> products = supplier1.getProducts();
//
//            for (model.Product p: products) {
//                System.out.println(p.productName);
//            }
//
//            tx.commit();


//            org.hibernate.Transaction tx = session.beginTransaction();
//
//            model.Product product1 = new model.Product("product10", 10);
//            model.Product product2 = new model.Product("product11", 15);
//            model.MyTransaction transaction1 = new model.MyTransaction(1, 2);
//            model.MyTransaction transaction2 = new model.MyTransaction(2, 3);
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
//            model.MyTransaction transaction = session.get(model.MyTransaction.class, 27);
//            Set<model.Product> products = transaction.getProducts();
//
//            for (model.Product p: products) {
//                System.out.println(p.productName);
//            }
//
//            tx.commit();


//            Transaction tx = session.beginTransaction();
//            model.Product product = session.get(model.Product.class, 25);
//            Set<model.MyTransaction> transactions = product.getTransactions();
//
//            for (model.MyTransaction t: transactions) {
//                System.out.println(t.transactionNumber);
//            }
//
//            tx.commit();

        } finally {
            session.close();
        }
    }
}