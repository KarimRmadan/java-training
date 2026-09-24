import java.util.Scanner;

public class Statistik {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Array mit 5 Elementen anlegen
        int[] werte = new int[5];

        // Array befüllen
        for (int i = 0; i < werte.length; i++) {
            System.out.println("Gebe eine Zahl ein: ");
            werte[i] = scanner.nextInt();
        }


        // EINZELNE SCHLEIFEN

        // For-each-Schleife zum Berechnen der Summe
        int summe = 0;

        for (int wert : werte) {
            summe = summe + wert;
        }

        System.out.println("Summe: " + summe);


        // Berechnung des Durchschnitts
        double durchschnitt = (double) summe / werte.length;

        System.out.printf("Durchschnitt: %.2f%n", durchschnitt);


        // For-each-Schleife zum Ermitteln des kleinsten Wertes
        int min = werte[0];

        for (int wert : werte) {
            if (wert < min) {
                min = wert;
            }
        }

        System.out.println("Kleinster Wert: " + min);


        // For-each-Schleife zum Ermitteln des größten Wertes
        int max = werte[0];

        for (int wert : werte) {
            if (wert > max) {
                max = wert;
            }
        }

        System.out.println("Größter Wert: " + max);


        //ALLES IN EINER SCHLEIFE

        int summe2 = 0;
        int min2 = werte[0];
        int max2 = werte[0];

        for (int wert : werte) {
            summe2 = summe2 + wert;

            if (wert < min2) {
                min2 = wert;
            }

            if (wert > max2) {
                max2 = wert;
            }
        }

        // Durchschnitt nach der Schleife berechnen
        double durchschnitt2 = (double) summe2 / werte.length;

        System.out.println("Summe: " + summe2);
        System.out.printf("Durchschnitt: %.2f%n", durchschnitt2);
        System.out.println("Kleinster Wert: " + min2);
        System.out.println("Größter Wert: " + max2);


        // RÜCKWÄRTS AUSGEBEN

        System.out.println("\nWerte in umgekehrter Reihenfolge:");

        for (int i = werte.length - 1; i >= 0; i--) {
            System.out.println(werte[i]);
        }

        scanner.close();
    }
}