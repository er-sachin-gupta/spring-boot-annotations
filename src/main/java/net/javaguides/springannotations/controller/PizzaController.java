package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.service.Pizza;
import net.javaguides.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
//@Component("pizzaDemo")
public class PizzaController {

    private Pizza pizza;

    public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
        this.pizza = pizza;
    }

    // Field Injection
//    @Autowired
//    private VegPizza vegPizza;

    // Constructor Injection
    /*@Autowired
    public PizzaController(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }*/

    // Setter Injection
    /*@Autowired
    public void setVegPizza(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }*/

    public String getPizza() {
        return pizza.getPizza();
//        return  "Hot Pizza!";
    }

}
