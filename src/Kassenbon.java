import java.util.Scanner;

public class Kassenbon {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        //Eingaben einlesen
        System.out.println("Produktname: ");
        String produktName = scanner.nextLine();

        System.out.println("Preis pro Stück: ");
        double preisProStueck = Double.parseDouble(scanner.nextLine().replace(',', '.').trim());


        System.out.println("Menge: ");
        int menge = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("ist es ein Lebensmittel? (ja/nein)");
        String antwortLebensmittel = scanner.nextLine();

        boolean istLebensmittel = antwortLebensmittel.equalsIgnoreCase("ja")||
                antwortLebensmittel.equalsIgnoreCase("j");


        //Preise in Cent beträge umwandeln
        int preisInCent = (int) Math.round(preisProStueck * 100);

        int nettoInCent = preisInCent * menge;

        int steuersatz;

        //erforderlichen steuersatz ermitteln
        if (istLebensmittel) {
            steuersatz = 7;
        } else {
            steuersatz = 19;
        }

        //Steuersatz und bruttowert berechnen
        int steuerInCent = nettoInCent * steuersatz / 100;

        int bruttoInCent = nettoInCent + steuerInCent;

        //bon design erstellt und mit benötigten werten bestückt
        StringBuilder bon = new StringBuilder();

        bon.append("\n---Kassenbon---\n");
        bon.append("Produktname: ").append(produktName).append("\n");
        bon.append("Menge: ").append(menge).append("\n");
        bon.append("Lebensmittel? ").append(istLebensmittel ? "Ja" : "Nein").append("\n");
        bon.append("\n");
        bon.append("--------------------------------------\n");
        bon.append("\n");
        bon.append("Netto: ") .append(String.format("\t\t%d,%02d €",
                nettoInCent / 100,
                nettoInCent % 100)).append("\n");
        bon.append("Steuer: ").append(String.format("\t%d,%02d €",
                steuerInCent / 100,
                steuerInCent % 100)).append("\n");
        bon.append("Brutto: ").append(String.format("\t%d,%02d €",
                bruttoInCent / 100,
                bruttoInCent % 100)).append("\n");


        //Ausgabe
        System.out.println(bon);


    }
}
