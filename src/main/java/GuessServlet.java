import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, resp);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int numToGuess = (int) (Math.random() * (3 - 1 + 1) + 1);
        int guess = Integer.parseInt(request.getParameter("number"));
        if (guess == numToGuess) {
            response.sendRedirect("/correct");
        } else if (guess < 1 || guess > 3) {
            response.sendRedirect("/guess");
        } else {
            response.sendRedirect("/incorrect");
        }
    }
}
