package listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 *
 * @author Shahin_Rashidbayli
 */
public class ServletContextListenerImpl implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener ise dusdu");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listener dayandi ");
    }
    
}
