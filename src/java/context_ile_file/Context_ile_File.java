package context_ile_file;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Context_ile_File extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       
        ServletContext context = getServletContext();
        InputStream txtstream = context.getResourceAsStream("/WEB-INF/shahin.txt");
        InputStream propstream = context.getResourceAsStream("WEB-INF/nameSurname.properties"); //isledilmeye hazirdir.
        
        Properties properties = new Properties();
        properties.load(propstream);
        
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("surname"));
        
        int content;
        ServletOutputStream sos = response.getOutputStream();
        while((content = txtstream.read())!=-1){
                sos.write(content);
        }        
    }
}
