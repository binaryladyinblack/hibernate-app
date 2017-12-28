import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Category;
import model.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import static java.lang.Integer.parseInt;


@WebServlet("/InsertProductServlet")
public class InsertProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private SessionFactory ourSessionFactory;

//    static {
//        try {
//            Configuration configuration = new Configuration();
//            configuration.configure();
//
//            ourSessionFactory = configuration.buildSessionFactory();
//        } catch (Throwable ex) {
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//    public static Session getSession() throws HibernateException {
//        return ourSessionFactory.openSession();
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String productName = request.getParameter("name");
        String unitsOnStock = request.getParameter("units");
        String category = request.getParameter("category");

        Product product = new Product();
        product.setProductName(productName);
        product.setUnitsOnStock(parseInt(unitsOnStock));
        product.setCategory(new Category(category));

        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }

        Session session = ourSessionFactory.openSession().getSession();

        Transaction tx = session.beginTransaction();
        session.save(product);

        tx.commit();
        session.close();
        response.sendRedirect("GetDataServlet");
    }
}