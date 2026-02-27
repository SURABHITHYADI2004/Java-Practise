import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException, ServletException {
        String name =req.getParameter("username");
        req.setAttribute("message", "Hello" + name +  "from First Servlet");

        RequestDispatcher rd = req.getRequestDispatcher("second");
        rd.forward(req, res);
    }
}