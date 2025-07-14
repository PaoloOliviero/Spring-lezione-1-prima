package paolooliviero.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import paolooliviero.u5d1.entities.Menu;
import paolooliviero.u5d1.entities.Pizza;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

				Menu menu = context.getBean(Menu.class
				);
				menu.stampaMenu();

				context.close();
	}

}
