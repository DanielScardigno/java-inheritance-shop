package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    private String colore;
    private boolean wireless;

    public Cuffie(String nome, String descrizione, double prezzo, double iva, String colore, boolean wireless) {

        super(nome, descrizione, prezzo, iva);

        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return "Colore: " + colore;
    }

    public String getConnessione() {

        String connessioneMessage = "Cablata";

        if (wireless == true) {
            connessioneMessage = "Wireless";
        }

        return "Connessione: " + connessioneMessage;
    }
}