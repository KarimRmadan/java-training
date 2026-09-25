import java.util.Scanner;

public class ComputerRaet {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int unten = 1;
        int oben = 100;
        int zaehler = 1;
        boolean istErraten = false;

        while (!istErraten) {
            for (int i = 0; i < 7 ; i++) {
                int tipp = (unten + oben) / 2;
                System.out.println(tipp);
                System.out.println("k,g oder r?");
                String antwort = scanner.nextLine();

                if (antwort.equals("k")) {
                    oben = tipp - 1;

                } else if (antwort.equals("g")) {
                    unten = tipp + 1;

                } else if (antwort.equals("r")) {
                    System.out.println("Ziel Erreicht\n du hast " + (i + 1) + "Versuche gebraucht");
                    istErraten = true;
                    break;
                }
            } if (!istErraten) {
                System.out.println("Du Schummelst!");
                break;
            }
        }
    }
}

