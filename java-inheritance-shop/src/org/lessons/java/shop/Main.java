package org.lessons.java.shop;
public class Main {
    public static void main(String[] args) {
        
        Smartphone newSmartphone = new Smartphone("Samsung A55", "Samsung A55 Blu scuro 256 GB", 300, 22, "123456789101112", 256);

        System.out.println(newSmartphone.getCodice());
        System.out.println(newSmartphone.getNome());
        System.out.println(newSmartphone.getDescrizione());
        System.out.println(newSmartphone.getPrezzoBase());
        System.out.println(newSmartphone.getPrezzoConIva());
        System.out.println(newSmartphone.getNomeEsteso());
        System.out.println(newSmartphone.getCodiceIMEI());
        System.out.println(newSmartphone.getMemoria());

        System.out.println();
        System.out.println("-------------------------"); //spaziatura
        System.out.println();

        Televisore newTelevisore = new Televisore("LG Smart TV Ultra", "Smart TV Ultra HD 50 pollici", 400.00, 22.00, 50, true);

        System.out.println(newTelevisore.getCodice());
        System.out.println(newTelevisore.getNome());
        System.out.println(newTelevisore.getDescrizione());
        System.out.println(newTelevisore.getPrezzoBase());
        System.out.println(newTelevisore.getPrezzoConIva());
        System.out.println(newTelevisore.getNomeEsteso());
        System.out.println(newTelevisore.getPollici());
        System.out.println(newTelevisore.isSmart());

        System.out.println();
        System.out.println("-------------------------"); //spaziatura
        System.out.println();

        Cuffie newCuffie = new Cuffie("Airpods", "Auricolari wireless Apple", 120.00, 22.00, "bianco", true);

        System.out.println(newCuffie.getCodice());
        System.out.println(newCuffie.getNome());
        System.out.println(newCuffie.getDescrizione());
        System.out.println(newCuffie.getPrezzoBase());
        System.out.println(newCuffie.getPrezzoConIva());
        System.out.println(newCuffie.getNomeEsteso());
        System.out.println(newCuffie.getColore());
        System.out.println(newCuffie.getConnessione());
    }
}