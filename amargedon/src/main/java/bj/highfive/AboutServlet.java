package bj.highfive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "about", urlPatterns = "/about")
public class AboutServlet extends HttpServlet{
    @Override
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException
{
   PrintWriter out = resp.getWriter();
    resp.setContentType("text/html");
    resp.setCharacterEncoding("UTF-8");

    out.println("<h2>Hello depuis la servlet <strong>AboutServlet</strong></h2>");
}
}
