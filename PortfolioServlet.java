import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class PortfolioServlet extends HttpServlet { 
 
    protected void doGet(HttpServletRequest req, 
                         HttpServletResponse res) 
                         throws IOException { 
 
        res.setContentType("text/html"); 
        PrintWriter out = res.getWriter(); 
 
        out.println("<h1>Welcome to my portfolio</h1>");
        out.println("<h2>About Me</h2>");
        out.println("<p>I am Surabhi Thyadi.Currently pursuing B.tech under the domain of CSE in GIET University.</p>");
        out.println("<p>I am intrested in learning programming and improving my technical skills.</p>");
        out.println("<h2>Education</h2>");
        out.println("<table border=1>");
        out.println("<tr>");
        out.println("<th>SL.NO</th>");
        out.println("<th>DEGREES</th>");
        out.println(" <th>BOARD/UNIVERSITY</th>");
        out.println("<th>YEAR</th>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>1</td>");
        out.println("<td>Bachelor's Degree</td>");
        out.println("<td>Gandhi Institue of Engineering and Technology University</td>");
        out.println("<td>2024-2028</td>");
        out.println(" </tr>");
        out.println("<tr>");
        out.println("<td>2</td>");
        out.println("<td>Intermediate</td>");
        out.println("<td>Sri Chaitanya College</td>");
        out.println("<td>2020-2022</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>3</td>");
        out.println("<td>Matriculation</td>");
        out.println("<td>SFS EM School</td>");
        out.println("<td>2019-2020</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println(" <h2>Technical Skills</h2>");
        out.println("<ul>");
        out.println("<li>Java</li>");
        out.println("<li>HTML</li>");
        out.println("<li>C</li>");
        out.println("</ul>");
        out.println("<h2>My Projects</h2>");
        out.println("<h3>Project1:Virtual College Store</h3>");
        out.println("<p>A Virtual College Store is an online system developed to provide students, \r\n" + //
                        "        faculty, and staff with easy access to college-related products such as books, \r\n" + //
                        "        stationery, uniforms, notes, and other academic materials through a digital platform. \r\n" + //
                        "        It works like an e-commerce website where users can register, log in, view available items,\r\n" + //
                        "         place orders, and track purchases, while the admin manages products, users, stock, \r\n" + //
                        "         and orders. This system helps reduce manual work, saves time, minimizes paperwork, \r\n" + //
                        "         and ensures efficient inventory management. It is commonly developed as a \r\n" + //
                        "         3rd semester project using technologies like HTML, CSS, JavaScript for the frontend, \r\n" + //
                        "         backend languages such as PHP or Python, and a database like MySQL.</p>");
        out.println("<h3>Project2:EVENT HUB MANAGEMENT</h3>");
        out.println("<p>An Event Hub Management Project is a web-based system developed to plan, organize, and manage \r\n" + //
                        "        college or organizational events efficiently through a single digital platform. \r\n" + //
                        "        The system allows users to view upcoming events, register or book events, and receive event details,\r\n" + //
                        "         while the admin can create events, manage schedules, venues, participants, and monitor registrations. \r\n" + //
                        "         This project reduces manual coordination, improves communication, and ensures smooth event handling by\r\n" + //
                        "          maintaining all event data in a centralized database. It is commonly completed as a 4th semester project,\r\n" + //
                        "           using technologies such as HTML, CSS, JavaScript for the frontend, backend languages like PHP or Python,\r\n" + //
                        "           and a database such as MySQL.</p>");
        out.println("<section>");
        out.println("<form action=\"\">");
        out.println("<fieldset>");
        out.println(" <legend>Contact Form</legend>");
        out.println("<label for=\"\">Name:</label>");
        out.println("<br>");
        out.println("<input type=\"text\">");
        out.println("<br>");
        out.println("<label for=\"\">Email:</label>");
        out.println("<br>");
        out.println("<input type=\"Email\" placeholder=\"surabhithyadi@gmail.com\" required>");
        out.println("<br>");
        out.println("<label for=\"\">Message:</label>");
        out.println("<br>");
        out.println("<textarea id=\"textarea\" rows=\"5\" cols=\"50\" placeholder=\"Message\" required></textarea>");
        out.println("</fieldset>");
        out.println("</form>");
        out.println("</section>");
    } 
}