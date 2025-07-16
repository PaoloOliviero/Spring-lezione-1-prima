package paolooliviero.u5d1.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Value("${costo.coperto}")
    private double costoCoperto;

    @Autowired
    @Qualifier("Margherita")
    private Pizza pizza;

    @Autowired
    @Qualifier("Cola")
    private Bevanda bevanda;

    @Override
    public void run(String... args) {
        List<Prodotto> ordinati = List.of(pizza, bevanda);

        Ordine ordine = new Ordine(1, 3, StatoOrdine.IN_CORSO, ordinati, costoCoperto);

        System.out.println(ordine);
    }
}

