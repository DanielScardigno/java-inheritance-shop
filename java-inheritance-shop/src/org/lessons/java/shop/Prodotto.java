package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    
    public int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {

        Random randomGenerator = new Random();
        codice = randomGenerator.nextInt(1000);

        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public String getCodice() {
        return "Codice prodotto: " + Integer.toString(codice);
    }

    public static String getCodicePaddato(String codice) {
        int codiceTrimmato = Integer.parseInt(codice.replace("Codice prodotto: ", ""));
        String codicePaddatoStr = String.format("%08d", codiceTrimmato);
        return codicePaddatoStr;
    }

    public String getNome() {
        return "Nome: " + nome;
    }

    public String getDescrizione() {
        return "Descrizione: " + descrizione;
    }

    public String getPrezzoBase() {
        return "Prezzo base: " + String.format("%.2f", prezzo) + "$";
    }

    public String getPrezzoConIva() {
        double prezzoConIva = prezzo + (prezzo * iva) / 100; 
        String prezzoConIvaStr = String.format("%.2f", prezzoConIva);
        String prezzoConIvaMessage = "Prezzo con IVA: " + prezzoConIvaStr + "$";
        return prezzoConIvaMessage;
    }

    public String getNomeProdotto() {
        return toString();
    }

    @Override
    public String toString() {
        String nomeProdotto = Integer.toString(codice) + "-" + nome;
        return "Nome Prodotto: " + nomeProdotto.replaceAll(" ", "-");
    }
}