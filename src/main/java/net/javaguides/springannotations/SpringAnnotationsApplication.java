package net.javaguides.springannotations;

import net.javaguides.springannotations.controller.MyController;
import net.javaguides.springannotations.controller.PizzaController;
import net.javaguides.springannotations.lazy.LazyLoader;
import net.javaguides.springannotations.repository.MyRepository;
import net.javaguides.springannotations.scope.PrototypeBean;
import net.javaguides.springannotations.scope.SingletonBean;
import net.javaguides.springannotations.service.MyService;
import net.javaguides.springannotations.service.VegPizza;
import net.javaguides.springannotations.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context =  SpringApplication.run(SpringAnnotationsApplication.class, args);
		/*SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());

		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.hashCode());

		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean3.hashCode());

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());

		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());

		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean3.hashCode());*/

		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
		System.out.println(valueAnnotationDemo.getDefaultName());
		System.out.println(valueAnnotationDemo.getHost());
		System.out.println(valueAnnotationDemo.getEmail());
		System.out.println(valueAnnotationDemo.getPassword());
		System.out.println(valueAnnotationDemo.getJavaHome());

		/*PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaDemo");
//		PizzaController pizzaController = context.getBean("pizzaDemo", PizzaController.class);
//		PizzaController pizzaController = context.getBean(PizzaController.class);
		System.out.println(pizzaController.getPizza());*/

		/*MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());

		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.hello());

		MyRepository myRepository = context.getBean(MyRepository.class);
		System.out.println(myRepository.hello());


		LazyLoader lazyLoader = context.getBean(LazyLoader.class);*/

//		VegPizza vegPizza = context.getBean(VegPizza.class);
//		VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
		/*VegPizza vegPizza = (VegPizza) context.getBean("vegPizza");
		System.out.println(vegPizza.getPizza());*/
	}

}
