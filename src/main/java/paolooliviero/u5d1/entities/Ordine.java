package paolooliviero.u5d1.entities;

import java.time.LocalTime;
import java.util.List;

public class Ordine {
    private int numero;
    private int coperti;
    private StatoOrdine stato;
    private LocalTime ora;
    private List<Prodotto> prodotti;
    private double costoCoperto;

    public Ordine(int numero, int coperti, StatoOrdine stato, List<Prodotto> prodotti, double costoCoperto) {
        this.numero = numero;
        this.coperti = coperti;
        this.stato = stato;
        this.prodotti = prodotti;
        this.costoCoperto = costoCoperto;
        this.ora = LocalTime.now();
    }

    public double getTotale() {
        double totaleProdotti = 0;

        for (Prodotto p : prodotti) {
            totaleProdotti += p.getPrezzo();
        }

        double totaleCoperti = coperti * costoCoperto;

        return totaleProdotti + totaleCoperti;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numero=" + numero +
                ", coperti=" + coperti +
                ", stato=" + stato +
                ", ora=" + ora +
                ", prodotti=" + prodotti +
                ", costoCoperto=" + costoCoperto +
                '}';
    }
}