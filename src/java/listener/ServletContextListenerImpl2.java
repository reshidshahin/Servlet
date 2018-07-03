
package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class ServletContextListenerImpl2 implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
         System.out.println("Listener ise dusdu - 2");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listener dayandi - 2");
    }
    
}
