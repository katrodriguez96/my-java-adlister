import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // if user is already logged in, redirect to profile page
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.isEmpty() || password.isEmpty()) {
            response.sendRedirect("/login");
        } else {
            request.getSession().setAttribute("username", username);
            request.getSession().setAttribute("user", true);
            response.sendRedirect("/profile");
        }

//        boolean isAdmin = username.equals("admin") && password.equals("password");
//
//        if (isAdmin) {
//            request.getSession().setAttribute("isAdmin", true);
//            response.sendRedirect("/profile");
//        } else {
//            response.sendRedirect("/login");
//        }
    }
}
