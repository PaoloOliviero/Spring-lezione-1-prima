package paolooliviero.u5d1.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu {
    private List<Pizza> pizze;
    private List<Bevanda> bevande;

    public Menu(List<Pizza> pizze,
                List<Bevanda> bevande)
    {
        this.pizze = pizze;
        this.bevande = bevande;
    }

    public void stampaMenu() {
        System.out.println("Menu Pizze:");
        for (Pizza pizza : pizze) {
            String nome = pizza.getNome();
            double prezzo = pizza.getPrezzo();
            int calorie = pizza.getCalorie();

            System.out.println(" - " + nome + ": " + calorie + " cal - €" + prezzo);
        }

        System.out.println("Bevande:");
        for (Bevanda bevanda : bevande) {
            String nome = bevanda.getNome();
            double prezzo = bevanda.getPrezzo();
            int calorie = bevanda.getCalorie();

            System.out.println(" - " + nome + ": " + calorie + " cal - €" + prezzo);
        }
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Bevanda> getBevande() {
        return bevande;
    }

    public void setBevande(List<Bevanda> bevande) {
        this.bevande = bevande;
    }
}

