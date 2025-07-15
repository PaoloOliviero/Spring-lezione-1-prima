package paolooliviero.u5d1.entities;

public class Tavolo {
    private int numero;
    private int maxCoperti;
    private boolean occupato;

    public Tavolo(int numero, int maxCoperti, boolean occupato) {
        this.numero = numero;
        this.maxCoperti = maxCoperti;
        this.occupato = occupato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public void setMaxCoperti(int maxCoperti) {
        this.maxCoperti = maxCoperti;
    }

    public boolean isOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }
}