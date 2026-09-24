import java.util.Scanner;

public class Kalender {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int tageImFebruar;

        //Eingabe einlesen
        System.out.println("Gebe ein Jahr ein: ");
        int jahr = scanner.nextInt();


        //boolean anlegen
        boolean istSchaltjahr = jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0;

        //Prüfung ob Schaltjahr mit passenden Ausgaben
        if (istSchaltjahr) {
            System.out.println(jahr + " ist ein Schaltjahr.");
            tageImFebruar = 29;
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
            tageImFebruar = 28;
        }

        //Eingabe einlesen
        System.out.println("gebe eine Zahl für den Wochentag ein: ");
        int tag = scanner.nextInt();

        //Switch Case zum Ausgeben des Wochentages
        switch (tag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ist kein Wochentag!");
        }

        //Eingabe einlesen
        System.out.println("Gebe eine Zahl für den gewünschten Monat ein. ");
        int monat = scanner.nextInt();

        //Abfrage ob die Eingabe zwischen 1 und 12 ist
        if (monat >= 1 && monat <= 12) {
            switch (monat) {
                case 1:
                    System.out.println("Januar");
                    break;
                case 2:
                    System.out.println("Februar");
                    break;
                case 3:
                    System.out.println("März");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("Mai");
                    break;
                case 6:
                    System.out.println("Juni");
                    break;
                case 7:
                    System.out.println("Juli");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("Oktober");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("Dezember");
                    break;
            }
        } else {
            System.out.println("Kein Monat!");
        }

        //Abfrage ob es sich um den Monat Februar handelt
        if (monat != 2) {
            switch (monat) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("31 Tage");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("30 Tage");
                    break;
            }
        } else {
            System.out.println(tageImFebruar + " Tage");

        }
    }
}
