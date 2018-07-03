package requestscope;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/requestAttributeExample"})
public class RequestAttributeExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PersonPojo person1 = new PersonPojo("Shahin", "Rashidbayli", 1,"05512344313");
        PersonPojo person2 = new PersonPojo("Nicat", "Rashidli", 2,"05023092340");
        
        List<PersonPojo> list = new ArrayList<>();
        
        list.add(person1);
        list.add(person2);
        
        request.setAttribute("personList", list);
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp"); //method forward edir 
        requestDispatcher.forward(request, response);
        
    }
}
