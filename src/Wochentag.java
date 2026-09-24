import java.util.Scanner;

public class Wochentag {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Variablen für die spätere Berechnung
        int tageImMonat = 0;
        int tageImFebruar = 0;
        int jahrImJahrhundert = 0;
        int jahrhundert = 0;
        int monat = 0;

        // Eingabe des Datums
        System.out.println("Tag?");
        int tag = scanner.nextInt();

        System.out.println("Monat?");
        monat = scanner.nextInt();

        System.out.println("Jahr?");
        int jahr = scanner.nextInt();

        // Prüfung, ob das eingegebene Jahr ein Schaltjahr ist
        boolean istSchaltjahr =
                jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0;

        // Festlegen der Anzahl der Tage im Februar
        if (istSchaltjahr) {
            System.out.println(jahr + " ist ein Schaltjahr.");
            tageImFebruar = 29;
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
            tageImFebruar = 28;
        }

        // Anzahl der Tage des eingegebenen Monats bestimmen
        if (monat != 2) {
            switch (monat) {
                case 1, 3, 5, 7, 8, 10, 12:
                    tageImMonat = 31;
                    break;
                case 4, 6, 9, 11:
                    tageImMonat = 30;
                    break;
            }
        } else {
            // Beim Februar hängt die Anzahl der Tage vom Schaltjahr ab
            tageImMonat = tageImFebruar;
        }

        // Prüfung, ob Tag und Monat ein gültiges Datum ergeben
        if (monat >= 1 && monat <= 12 && tag >= 1 && tag <= tageImMonat) {

            // Für Zellers Kongruenz werden Januar und Februar
            // als Monat 13 und 14 des Vorjahres behandelt
            if (monat == 1 || monat == 2) {
                monat = monat + 12;
                jahr = jahr - 1;
            }

            // Jahr innerhalb des Jahrhunderts bestimmen
            // Beispiel: 2026 -> 26
            jahrImJahrhundert = jahr % 100;

            // Jahrhundert bestimmen
            // Beispiel: 2026 -> 20
            jahrhundert = jahr / 100;

            // Berechnung des Wochentags mit Zellers Kongruenz
            // Ergebnis: 0 = Samstag, 1 = Sonntag, ... , 6 = Freitag
            int wochentagNummer =
                    (tag
                            + (13 * (monat + 1)) / 5
                            + jahrImJahrhundert
                            + jahrImJahrhundert / 4
                            + jahrhundert / 4
                            + 5 * jahrhundert) % 7;

            // Umwandlung der berechneten Zahl in den Namen des Wochentags
            switch (wochentagNummer) {
                case 0:
                    System.out.println("Der Wochentag ist: Samstag");
                    break;
                case 1:
                    System.out.println("Der Wochentag ist: Sonntag");
                    break;
                case 2:
                    System.out.println("Der Wochentag ist: Montag");
                    break;
                case 3:
                    System.out.println("Der Wochentag ist: Dienstag");
                    break;
                case 4:
                    System.out.println("Der Wochentag ist: Mittwoch");
                    break;
                case 5:
                    System.out.println("Der Wochentag ist: Donnerstag");
                    break;
                case 6:
                    System.out.println("Der Wochentag ist: Freitag");
                    break;
            }

        } else {
            // Ausgabe, wenn Tag oder Monat kein gültiges Datum ergeben
            System.out.println("Ungültiges Datum.");
        }

        scanner.close();
    }
}

