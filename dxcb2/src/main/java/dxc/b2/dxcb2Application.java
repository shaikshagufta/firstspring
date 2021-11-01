package dxc.b2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class dxcb2Application {
	public static void main(String[] args) {

		SpringApplication.run(dxcb2Application.class, args);


		for (int i=0; i<20; i++)
			try {
				Thread.sleep(1000);
				ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("settingsconfig.xml");
				Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("car"); 
				//Car car = new Car();
				vehicle.drive();
			} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("hello spring");
	}
}
