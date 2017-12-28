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
import model.Product;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import static java.lang.Integer.parseInt;


@WebServlet("/InsertProductServlet")
public class InsertProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private SessionFactory ourSessionFactory;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String productName = request.getParameter("name");
        String unitsOnStock = request.getParameter("units");
        String category = request.getParameter("category");

        Product product = new Product();
        product.setProductName(productName);
        product.setUnitsOnStock(parseInt(unitsOnStock));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDatabaseConfig");
        EntityManager em = emf.createEntityManager();
        EntityTransaction etx = em.getTransaction();

        etx.begin();

        Object result = em.createQuery("select dbID from Category as cat where cat.name = :name")
                                .setParameter("name", category)
                                .getResultList().get(0);

        System.out.println(result);
        product.setCategory(em.find(model.Category.class, (int)result));

        em.persist(product);

//        session.flush();
        etx.commit();
        em.close();
        response.sendRedirect("GetDataServlet");
    }
}