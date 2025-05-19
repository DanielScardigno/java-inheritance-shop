package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi aaggiungere al carrello?");
        int numeroProdotti = Integer.parseInt(input.nextLine());

        Prodotto[] carrello = new Prodotto[numeroProdotti];

        for (int i = 0; i < carrello.length; i++) {
            System.out.println("Inserire il nome del prodotto:");
            String nomeProdotto = input.nextLine();

            System.out.println("Inserire la descrizione del prodotto:");
            String descrizioneProdotto = input.nextLine();

            System.out.println("Inserire il prezzo del prodotto:");
            double prezzoProdotto = Double.valueOf(input.nextLine());

            System.out.println("Inserire l'iva del prodotto:");
            double ivaProdotto = Double.valueOf(input.nextLine());

            System.out.println("Inserire il tipo di prodotto (Smartphone, Televisore, Cuffie.)");
            String tipoProdotto = input.nextLine().toLowerCase();

            switch (tipoProdotto) {
                case "smartphone":
                    System.out.println("Inserisci il codice IMEI:");
                    String codiceImei = input.nextLine().toUpperCase();

                    System.out.println("Inserisci la memoria:");
                    int memoria = Integer.valueOf(input.nextLine());

                    carrello[i] = new Smartphone(nomeProdotto, descrizioneProdotto, prezzoProdotto, ivaProdotto, codiceImei, memoria);
                    break;
            
                case "televisore":

                    System.out.println("Inserisci i pollici");
                    int pollici = Integer.valueOf(input.nextLine());

                    System.out.println("Inserire se é smart:");
                    boolean smart = Boolean.valueOf(input.nextLine());

                    carrello[i] = new Televisore(nomeProdotto, descrizioneProdotto, prezzoProdotto, ivaProdotto, pollici, smart);
                    break;

                case "cuffie":

                    System.out.println("Inserisci il colore");
                    String colore = input.nextLine();

                    System.out.println("Inserire se sono wireless:");
                    boolean wireless = Boolean.valueOf(input.nextLine());

                    carrello[i] = new Cuffie(nomeProdotto, descrizioneProdotto, prezzoProdotto, ivaProdotto, colore, wireless);
                    break;

                default:
                    carrello[i] = new Prodotto(nomeProdotto, descrizioneProdotto, prezzoProdotto, ivaProdotto);
                    break;
            }
        }

        input.close();

        System.out.println("\nContenuto del carrello:\n");
        for (Prodotto prodotto : carrello) {
            System.out.println(prodotto);
            System.out.println("-------------------------");
        }
    }
}
