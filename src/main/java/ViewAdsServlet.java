import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="ViewAdsServlet", urlPatterns = "/ads")
public class ViewAdsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // use the factory to get the dao object
        Ads adsDao = DaoFactory.getAdsDao();
        // use method on dao to get all ads
        List<Ad> ads = adsDao.all();
        // pass data to jsp
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}
