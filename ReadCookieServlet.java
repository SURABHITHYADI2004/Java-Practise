import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReadCookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        PrintWriter out = res.getWriter();

        Cookie[] cookies = req.getCookies();

        for(Cookie c : cookies){
            if(c.getName().equals("username")){
                out.println("Welcome " + c.getValue());
            }
        }
    }
}