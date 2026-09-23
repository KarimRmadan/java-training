public class Steckbrief {
    static void main() {
        String vorname = "Karim";
        int alterInJahren = 120;
        double groesseInMetern = 1.87;
        char lieblingsBuchstabe = 'A';
        boolean istKaffeeTrinker = false;
        int geburtsjahr = 2026 - alterInJahren;
        int groesseInCM = (int) (groesseInMetern * 100);

        int gelebteTage = alterInJahren * 365; //Int weil es innerhalb der Max Value passt
        long gelebteSekunden = alterInJahren * 365L * 24 * 60 * 60; //long weil es die Max Value eines Integers übersteigt
        long ungefaehreHerzschlaege = gelebteSekunden * 70; //long weil es die Max Value eines Integers übersteigt

        double anteilSchlaf = 8.0/24.0;

        System.out.printf("Vorname: \t\t\t\t%s\nAlter in Jahren: \t\t%d\nGröße in Metern: \t\t%.2f\nLieblingsbuchstabe: \t%c\nKaffee Trinker?: \t\t%s\nGeburtsjahr: \t\t\t%d\nGröße in CM: \t\t\t%d"
                ,vorname,alterInJahren,groesseInMetern,lieblingsBuchstabe,istKaffeeTrinker? "Ja": "Nein",geburtsjahr,groesseInCM);

        System.out.printf("\n\nGelebte Tage: \t\t\t%d\nGelebte Sekunden:\t\t%d\nUngefähre Herzschläge: \t%d",
                gelebteTage,gelebteSekunden,ungefaehreHerzschlaege);

        System.out.println("\n\nAnteil des verschlafenen Lebens: " + (8/24) + "\nAnteil des verschlafenen Lebens: " + (8.0/24.0));
        System.out.printf("\n\nAnteil des verschlafenen Lebens: %.2f", anteilSchlaf);
        // int / int       → 0
        // double / double → 0.333333...

    }
}
