import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebServlet("/GetDataServlet")
public class GetDataServlet extends HttpServlet {
    private static final long serialVersionUID = 102831973239L;
    private SessionFactory ourSessionFactory;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }

        Session session = ourSessionFactory.openSession().getSession();


        Query query = session.createQuery("from Product");

        List<Product> products = query.list();
        request.setAttribute("products", products);

        request.getRequestDispatcher("productDetails.jsp").forward(request, response);
    }
}