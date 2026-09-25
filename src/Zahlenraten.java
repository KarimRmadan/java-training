import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    static void main() {
        // Zufallszahl und Scanner für die Benutzereingabe erstellen
        Random zufallsZahl = new Random();
        Scanner scanner = new Scanner(System.in);

        // Geheime Zufallszahl zwischen 0 und 100 erzeugen
        int geheim = zufallsZahl.nextInt(101);

        // Boolean ob die Zahl erraten wurde
        boolean istErraten = false;

        // Zählt die benötigten Versuche
        int versuche = 1;

        // Schleife läuft so lange, bis die geheime Zahl erraten wurde
        while (!istErraten) {

            // Zahl vom Benutzer einlesen
            int zahl = liesZahl(scanner, "Gebe eine Zahl ein: ");

            // Geratene Zahl mit der geheimen Zahl vergleichen
            String ergebnis = bewerte(zahl, geheim);

            // Ergebnis des Vergleichs ausgeben
            System.out.println(ergebnis);

            // Bei richtiger Zahl wird das Spiel beendet
            if (ergebnis.equals("richtig")) {
                istErraten = true;

                // Anzahl der benötigten Versuche ausgeben
                druckeErgebnis(versuche);
            } else {
                // Bei falscher Zahl den Versuchszähler erhöhen
                versuche++;
            }
        }
    }

    // Gibt eine Frage aus, liest die Eingabe ein und gibt sie als int zurück
    static int liesZahl(Scanner scanner, String frage) {
        System.out.println(frage);
        int zahl = Integer.parseInt(scanner.nextLine().trim());
        return zahl;
    }

    // Vergleicht die geratene Zahl mit der geheimen Zahl
    // und gibt die entsprechende Bewertung zurück
    static String bewerte(int geraten, int geheim) {
        if (geraten < geheim) {
            return "zu klein";
        } else if (geraten > geheim) {
            return "zu groß";
        } else {
            return "richtig";
        }
    }

    // Gibt am Ende die Anzahl der benötigten Versuche aus
    static void druckeErgebnis(int versuche) {
        System.out.println("Du hast " + versuche + " Versuche benötigt!");
    }
}