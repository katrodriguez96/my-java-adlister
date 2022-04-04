import models.DaoFactory;
import models.Product;
import models.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/products/create")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/products/create.jsp").forward(request, response);
    } // method to get the form to create a product up to our view at '/products/create' endpoint (url)

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Products productsDao = DaoFactory.getProductsDao();
        // create a new product based on the submitted data
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        Product product = new Product(name, price); // a new product object with both pieces of info from our form
        // persist (AKA save AKA insert) the new product into our data (for now, into the arraylist)
        productsDao.insert(product);
        response.sendRedirect("/products");
    }
}