package saulo.io.projetoSpringContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjetoSpringContextApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProjetoSpringContextApplication.class, args);
		
		MyController controller = (MyController) context.getBean("myController");
		
		controller.hello();
	}

}
