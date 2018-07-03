package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Context extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ServletContext sc = getServletContext();        
        String website_name = sc.getInitParameter("website");
        String email_address = sc.getInitParameter("emailaddress");
        
        PrintWriter pw = response.getWriter();
        pw.write("<html><body>");
        pw.write("Website name : " + website_name + "<br/>");
        pw.write("Email address : " + email_address);
        pw.write("</body></html>");
        System.out.println("Servlet Init Parameteres Names");
		
	System.out.println("Context Init Parameters Names");
	Enumeration<String> contextInitParams = sc.getInitParameterNames();
	while (contextInitParams.hasMoreElements()) {
		System.out.println(contextInitParams.nextElement());
	}
    }
}
