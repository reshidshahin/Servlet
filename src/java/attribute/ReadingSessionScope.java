package attribute;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadingSessionScope extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         PrintWriter pw = response.getWriter();
         pw.println(request.getSession().getAttribute("polad"));
         pw.println(request.getSession().getAttribute("nazli"));
         pw.close();        
        
    }

}
