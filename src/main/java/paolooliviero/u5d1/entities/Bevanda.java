package paolooliviero.u5d1.entities;

public class Bevanda extends Prodotto {
    public Bevanda(String nome, double prezzo, int calorie) {
        super(nome, prezzo, calorie);


    }

    @Override
    public String toString() {
        return "Bevanda{} " + super.toString();
    }
}

