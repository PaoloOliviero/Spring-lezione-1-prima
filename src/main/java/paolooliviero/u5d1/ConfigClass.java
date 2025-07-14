package paolooliviero.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import paolooliviero.u5d1.entities.Bevanda;
import paolooliviero.u5d1.entities.Menu;
import paolooliviero.u5d1.entities.Pizza;
import paolooliviero.u5d1.entities.Topping;

import java.util.List;

@Configuration

public class ConfigClass {

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 1.00, 50);
    }

    @Bean
    public Topping salame() {
        return new Topping("Salame", 0.80, 10);
    }

    @Bean
    public Pizza diavola() {
        Pizza pizza = new Pizza("Diavola", 6.00, 10);
        pizza.addTopping(prosciutto());
        pizza.addTopping(salame());
        return pizza;
    }

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 4.00, 50);
    }

    @Bean
    public Bevanda cola() {
        return new Bevanda("Cocacola", 3.00, 40);
    }

    @Bean
    public Bevanda acqua() {
        return new Bevanda("Acqua", 2.00, 0);
    }

    @Bean
    public Menu menu() {
        return new Menu(List.of(diavola(), margherita()), List.of(cola(), acqua()));
    }



}
