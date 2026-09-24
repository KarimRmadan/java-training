import java.util.Scanner;

public class Kalender {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        //Eingabe einlesen
        System.out.println("Gebe ein Jahr ein: ");
        int jahr = scanner.nextInt();

        //boolean anlegen
        boolean istSchaltjahr;

        //Prüfung ob Schaltjahr mit passenden Ausgaben
        if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
            istSchaltjahr = true;
            System.out.println(jahr + " ist ein Schaltjahr.");
        } else {
            istSchaltjahr = false;
            System.out.println(jahr + " ist kein Schaltjahr.");
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
    }
}
