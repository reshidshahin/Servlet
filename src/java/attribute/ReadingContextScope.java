package attribute;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readingContextScope")
public class ReadingContextScope extends HttpServlet {                                                                                          
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException {  
         PrintWriter pw = response.getWriter();
         pw.println(getServletContext().getAttribute("shahin"));
         pw.println(getServletContext().getAttribute("nicat"));
         pw.close();
         
    }
}
