// import java.io.*;
// import javax.servlet.*;
// import javax.servlet.http.*;

// public class CookieServlet extends HttpServlet {

//     protected void doGet(HttpServletRequest req,
//                          HttpServletResponse res)
//                          throws IOException {

//         PrintWriter out = res.getWriter();

//         Cookie c = new Cookie("username","Remo");
//         res.addCookie(c);

//         out.println("Cookie Created");
//     }
// }


import java.io.*;

import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
                          throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("user");

        Cookie c = new Cookie("username", name);

        res.addCookie(c);

        out.println("Cookie Created using POST method");
    }
}