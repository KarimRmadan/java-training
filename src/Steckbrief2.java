import java.util.Scanner;

public class Steckbrief2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Wie lautet dein Vorname? ");
        String vorname = scanner.nextLine().trim();


        System.out.print("Wie alt bist du? ");
        String eingabe = scanner.nextLine().trim();

        int alter;

        if (eingabe.isEmpty()) {
            alter = 18;
        } else {
            alter = Integer.parseInt(eingabe);
        }

        System.out.println("Wie groß bist du in Metern? ");
        double groesseInMetern = Double.parseDouble(scanner.nextLine().replace(',', '.').trim());

        System.out.println("Trinkst du Kaffee? (ja/nein)");
        String kaffeeAntwort = scanner.nextLine();

        boolean istKaffeeTrinker = kaffeeAntwort.equalsIgnoreCase("ja")||
                kaffeeAntwort.equalsIgnoreCase("j");



        System.out.printf("%s ist %d Jahre alt, %.2f m groß und wurde %d geboren", vorname, alter, groesseInMetern,(2026 - alter));

        System.out.printf("\n\nName in Großbuchstaben: %s\nAnzahl der Zeichen: %d\nAnfangsbuchstabe: %c",vorname.toUpperCase(),vorname.length(),vorname.charAt(0));

        System.out.printf("\n\nKaffeetrinker: %s", istKaffeeTrinker ? "Ja" : "Nein");

        */

        System.out.println("Gebe deinen vollen Namen ein: ");
        String vollerName = scanner.nextLine();

        String vorname2 = vollerName.substring(0,vollerName.indexOf(" "));
        String nachname2 = vollerName.substring(vollerName.indexOf(" " ) + 1, vollerName.length());

        String rueckwaerts = new StringBuilder(vorname2).reverse().toString();

        System.out.printf("Vorname: %s\nNachname: %s\nInitiale Vorname: %c\nInitiale Nachname: %c\nVorname rückwärts: %s",
                vorname2,nachname2,vorname2.charAt(0),nachname2.charAt(0), rueckwaerts);
        //wenn kein leerzeichen eingegeben wird,entsteht ein Exception Fehler

    }
}
