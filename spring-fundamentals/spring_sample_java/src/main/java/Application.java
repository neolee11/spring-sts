import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service);

		CustomerService service1 = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service1);
		
		
		System.out.println(service.findAll().get(0).getFirstname());
		
		 
		
	}

}
