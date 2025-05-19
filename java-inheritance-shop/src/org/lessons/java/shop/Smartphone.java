package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    private String codiceIMEI;
    private int memoria;

    public Smartphone(String nome, String descrizione, double prezzo, double iva, String codiceIMEI, int memoria) {

        super(nome, descrizione, prezzo, iva);

        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    public String getCodiceIMEI() {
        return "Codice IMEI: " + codiceIMEI;
    }

    public String getMemoria() {
        return "Memoria: " + Integer.toString(memoria) + " GB";
    }

    @Override
    public String toString() {
        return super.toString() + "\ncodice IMEI: " + codiceIMEI + "\n" + Integer.toString(memoria) + " GB";
    }
}