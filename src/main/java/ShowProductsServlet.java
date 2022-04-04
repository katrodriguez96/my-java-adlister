import models.DaoFactory;
import models.Product;
import models.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ShowProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        // Use the factory to get the dao object (which holds all of our methods)
        Products productsDao = DaoFactory.getProductsDao();

        // Use a method on the dao to get all the products
        // use methods from our implementation, like calling all products
        List<Product> products = productsDao.all();

        // Pass the data to the jsp
        request.setAttribute("products", products);
        request.getRequestDispatcher("/products/index.jsp").forward(request, resp);
    }
}
