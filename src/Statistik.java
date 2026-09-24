import java.util.Scanner;

public class Statistik {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //Array mit 5 elementen angelegt
        int[] werte = new int[5];
        int summe = 0;

        //for schleife um in jedem durchgang eine Zahl in den Array zu schreiben
        for (int i = 0; i < werte.length; i++) {
            System.out.println("Gebe eine Zahl ein: ");
            werte[i] = scanner.nextInt();
        }

        //for schleife zum berechnen der Summe
        for (int wert : werte) {
            summe = summe + wert;
        }
        System.out.println("Summe: " + summe);

        //Berechnung des Durchschnitts
        double durchschnitt = summe / werte.length;
        System.out.println("Durchschnitt: " + durchschnitt);

        //For-Schleife für Min/Max ausgabe
        for (int wert : werte) {
            int min = werte[0];
            int max = werte[0];
            if (min > wert){
                min = wert;
            }
            if (max < wert){
                max = wert;
            }
            System.out.printf("kleinster Wert: %d\ngrößter Wert: %d",min,max);
        }


    }

}
