import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitCount extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException {
    PrintWriter out = res.getWriter();
    int count = 1;
    Cookie[] c = req.getCookies();

    if (c != null) {
      count = Integer.parseInt(c[0].getValue()) + 1;
    }
    Cookie cookie = new Cookie("visit", String.valueOf(count));
    res.addCookie(cookie);
    out.println("Visits: " + count);
  }
}