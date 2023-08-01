package net.javaguides.springannotations.config;

import net.javaguides.springannotations.controller.PizzaController;
import net.javaguides.springannotations.service.NonVegPizza;
import net.javaguides.springannotations.service.Pizza;
import net.javaguides.springannotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
//@Lazy
public class AppConfig {

//    @Bean(name = "vegPizzaBean")
    @Bean
//    @Lazy
    public Pizza vegPizza() {
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza() {
        return new NonVegPizza();
    }

    /**
     * The init-method attribute specifies a method that is to be called on the bean immediately upon instantiation. This init method is called after initializing bean properties.
     * The destroy() method will be called before the bean is removed from the IOC container.
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController() {
        return  new PizzaController(nonVegPizza());
    }

}
