package paolooliviero.u5d1.entities;

public class Pizza extends Prodotto {
    public Pizza(String nome, double prezzoBase, int calorieBase) {
        super(nome, prezzoBase, calorieBase);

    }

    @Override
    public String toString() {
        return "Pizza{} " + super.toString();
    }


    public void addTopping(Topping topping) {
        topping.add(topping);
    }


}


