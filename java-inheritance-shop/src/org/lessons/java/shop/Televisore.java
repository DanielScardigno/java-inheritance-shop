package org.lessons.java.shop;

public class Televisore extends Prodotto {

    private int pollici;
    private boolean smart;

    public Televisore(String nome, String descrizione, double prezzo, double iva, int pollici, boolean smart) {

        super(nome, descrizione, prezzo, iva);

        this.pollici = pollici;
        this.smart = smart;
    }

    public String getPollici() {
        return "Pollici: " + Integer.toString(pollici);
    }

    public String isSmart() {

        String isSmart = "No";

        if (smart == true) {
            isSmart = "Si";
        }

        return "Smart: " + isSmart;
    }
}