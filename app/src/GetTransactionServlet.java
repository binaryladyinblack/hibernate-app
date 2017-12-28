import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MyTransaction;
import model.Product;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebServlet("/GetTransactionServlet")
public class GetTransactionServlet extends HttpServlet {
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


        Query query = session.createQuery("from MyTransaction");

        List<MyTransaction> transactions = query.list();
        request.setAttribute("transactions", transactions);

        request.getRequestDispatcher("transactionDetails.jsp").forward(request, response);
    }
}