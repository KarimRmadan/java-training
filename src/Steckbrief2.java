import java.util.Scanner;

public class Steckbrief2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie lautet dein Vorname? ");
        String vorname = scanner.nextLine();


        System.out.print("Wie alt bist du? ");
        int alter = Integer.parseInt(scanner.nextLine());

        System.out.println("Wie groß bist du in Metern? ");
        double groesseInMetern = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.println("Trinkst du Kaffee? (ja/nein)");
        boolean istKaffeeTrinker = scanner.nextLine().equalsIgnoreCase("ja");



        System.out.printf("%s ist %d Jahre alt, %.2f m groß und wurde %d geboren", vorname, alter, groesseInMetern,(2026 - alter));

        System.out.printf("\n\nName in Großbuchstaben: %s\nAnzahl der Zeichen: %d\nAnfangsbuchstabe: %c",vorname.toUpperCase(),vorname.length(),vorname.charAt(0));

        System.out.printf("\n\nKaffeetrinker: %s", istKaffeeTrinker ? "Ja" : "Nein");
    }
}
