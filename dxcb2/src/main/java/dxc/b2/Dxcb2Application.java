package dxc.b2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import constructor.injection.Employee;

@SpringBootApplication
public class Dxcb2Application {

	private static final String APPLICATION_CONTEXT_XML = "fanKnob.xml";


	public static void main(String[] args) {
		SpringApplication.run(Dxcb2Application.class, args);
		BeanFactory factory = loadContext();

		Employee employee = (Employee)factory.getBean("employee");  
		employee.show(); 
	}


	private static void driveVehicle() {
		ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("settingsconfig.xml");
		Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("car"); 
		//Car car = new Car();
		vehicle.drive();
	}


	private static BeanFactory loadContext() {
		Resource resource = new ClassPathResource(APPLICATION_CONTEXT_XML);  
		BeanFactory factory = new XmlBeanFactory(resource);
		return factory;
	}

}
