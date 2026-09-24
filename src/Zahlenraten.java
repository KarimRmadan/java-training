import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    static void main() {
        Random zufallsZahl = new Random();
        Scanner scanner = new Scanner(System.in);
        int geheim = zufallsZahl.nextInt(101);

        //zähler für versuche angelegt bei 1, damit der erste versuch mitgezählt wird
        int versuche = 1;
        //boolean auf false gesetzt
        boolean istErraten = false;

        //while schleife bis boolean auf true springt
        while (!istErraten) {
            System.out.println("Gebe eine Zahl ein: ");
            int zahl = scanner.nextInt();

            if (zahl < geheim){
                System.out.println("zu klein.");
                versuche++;
            }else if (zahl > geheim){
                System.out.println("zu groß.");
                versuche++;
            }else {
                System.out.println("Volltreffer!");
                istErraten = true;
                System.out.println("du hast " + versuche + " versuche benötigt!");
            }


        }
    }
}
