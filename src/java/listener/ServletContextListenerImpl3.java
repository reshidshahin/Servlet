package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class ServletContextListenerImpl3 implements ServletContextListener{
    
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Listener ise dusdu - 3");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Listener dayandi - 3");
	}
}

