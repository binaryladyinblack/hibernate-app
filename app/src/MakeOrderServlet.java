import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Category;
import model.MyTransaction;
import model.Product;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import static java.lang.Integer.parseInt;


@WebServlet("/MakeOrderServlet")
public class MakeOrderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private SessionFactory ourSessionFactory;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String transactionNumber = request.getParameter("transactionNumber");
        String productName = request.getParameter("productName");
        String units = request.getParameter("units");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");
        EntityManager em = emf.createEntityManager();
        EntityTransaction etx = em.getTransaction();

        etx.begin();

        MyTransaction trans = new MyTransaction();

        List result = em.createQuery("select dbID from Product as p where p.productName = :name")
                .setParameter("name", productName)
                .getResultList();

        if(result.size() == 0)
            trans.addProduct(null);
        else{
            Product product = em.find(model.Product.class, (int)result.get(0));
            trans.addProduct(product);
        }

        trans.setTransactionNumber(parseInt(transactionNumber));
        trans.setQuantity(parseInt(units));

        em.persist(trans);

        etx.commit();
        em.close();
        response.sendRedirect("GetTransactionServlet");
    }
}