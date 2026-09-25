import java.util.Scanner;

public class TicTacToe {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        // 2D-Array für das Spielbrett
        char[][] brett = new char[3][3];

        // Zeichen für den ersten Spieler
        char spieler = 'X';

        // Leert das Spielfeld
        leere(brett);

        // Maximal 9 gültige Spielzüge
        for (int i = 0; i < 9; i++) {

            // Gibt den aktuellen Stand des Spielfelds aus
            drucke(brett);

            // Informiert, welcher Spieler dran ist
            System.out.println("Spieler " + spieler + " ist dran!");

            // Spieler bestimmt die Zeile
            System.out.println("Zeile 0-2?");
            int zeile = scanner.nextInt();

            // Spieler bestimmt die Spalte
            System.out.println("Spalte 0-2?");
            int spalte = scanner.nextInt();

            // Prüft, ob die Eingabe innerhalb des Spielfelds liegt
            if (zeile < 3 && zeile >= 0 && spalte < 3 && spalte >= 0) {

                boolean erfolgreich = setze(brett, zeile, spalte, spieler);

                // Prüft, ob das Feld frei war
                if (erfolgreich) {

                    // Prüft nach dem gültigen Zug, ob der aktuelle Spieler gewonnen hat
                    if (hatGewonnen(brett, spieler)) {
                        System.out.println("Spieler " + spieler + " hat gewonnen!");
                        drucke(brett);
                        break;
                    }

                    // Wenn nach dem neunten Zug niemand gewonnen hat, endet das Spiel unentschieden.
                    if (i == 8) {
                        System.out.println();
                        System.out.println("Unentschieden!");
                        drucke(brett);
                        break;
                    }

                    // Nur wenn noch niemand gewonnen hat und noch Züge übrig sind,
                    spieler = wechsleSpieler(spieler);

                } else {
                    // Das gewählte Feld ist bereits belegt.
                    // i wird zurückgesetzt, damit der ungültige Zug nicht mitgezählt wird.
                    System.out.println("Feld bereits belegt! Bitte freies Feld wählen!");
                    i--;
                }

            } else {
                // Die eingegebene Zeile oder Spalte liegt nicht zwischen 0 und 2.
                // Der ungültige Zug wird nicht mitgezählt.
                System.out.println("Außerhalb des Feldes! Eingabe wiederholen!");
                i--;
            }
        }
    }


    // Methode zum Leeren bzw. Initialisieren des Spielfelds
    static void leere(char[][] brett) {

        // Doppelte Schleife, um jedes Feld im 2D-Array zu erreichen
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                brett[i][j] = '.';
            }
        }
    }


    // Methode zum Ausgeben des Spielfelds
    static void drucke(char[][] brett) {

        // Doppelte Schleife, um jedes Feld im 2D-Array zu erreichen
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                System.out.print(brett[i][j] + " ");
            }

            // Wechsel in die nächste Zeile
            System.out.println();
        }
    }


    // Methode zum Setzen eines Spielsteins
    static boolean setze(char[][] brett, int zeile, int spalte, char spieler) {

        boolean istSetze = false;

        // Nur wenn das Feld leer ist, darf der Spieler sein Zeichen setzen
        if (brett[zeile][spalte] == '.') {
            brett[zeile][spalte] = spieler;
            istSetze = true;
        }

        return istSetze;
    }


    // Methode zum Wechseln des Spielers
    static char wechsleSpieler(char spieler) {

        if (spieler == 'X') {
            spieler = 'O';
        } else {
            spieler = 'X';
        }

        return spieler;
    }


    // Methode zum Prüfen, ob ein Spieler gewonnen hat
    static boolean hatGewonnen(char[][] brett, char spieler) {

        boolean gewonnen = false;

        // Prüft alle Zeilen und Spalten
        for (int i = 0; i < 3; i++) {

            // Prüft, ob in einer Zeile dreimal das Zeichen des Spielers steht
            if (brett[i][0] == spieler &&
                    brett[i][1] == spieler &&
                    brett[i][2] == spieler) {

                gewonnen = true;
            }

            // Prüft, ob in einer Spalte dreimal das Zeichen des Spielers steht
            if (brett[0][i] == spieler &&
                    brett[1][i] == spieler &&
                    brett[2][i] == spieler) {

                gewonnen = true;
            }
        }

        // Diagonale von links oben nach rechts unten prüfen
        if (brett[0][0] == spieler &&
                brett[1][1] == spieler &&
                brett[2][2] == spieler) {

            gewonnen = true;
        }

        // Diagonale von rechts oben nach links unten prüfen
        if (brett[0][2] == spieler &&
                brett[1][1] == spieler &&
                brett[2][0] == spieler) {

            gewonnen = true;
        }

        // true bedeutet: Der Spieler hat eine vollständige Gewinnreihe
        return gewonnen;
    }
}