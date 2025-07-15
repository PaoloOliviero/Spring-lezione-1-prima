package paolooliviero.u5d1.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static paolooliviero.u5d1.entities.StatoOrdine.IN_CORSO;

@Component
public class AvvioOrdine implements CommandLineRunner {

    @Value("${costo.coperto}")
    private double costoCoperto;

    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) {
        List<Prodotto> ordinati = List.of(
                menu.getPizze().get(0),
                menu.getBevande().get(0)
        );

        Ordine ordine = new Ordine (1,
                3, StatoOrdine.IN_CORSO,
                ordinati, 2.00
        );

        System.out.println(ordine);

    }}
