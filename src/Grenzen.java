public class Grenzen {
    static void main() {
        //Variable auf größtmögliche setzen
        int maximaleGroesse = Integer.MAX_VALUE;

        //Alter in Sekunden berechnen
        long alterInSekunden = 70L * 365 * 24 * 60 * 60;

        //Antwort auf Frage
        /*int hat einen begrenzten Wertebereich. Integer.MAX_VALUE ist bereits der größte mögliche Wert. Wenn wir noch
        1 addieren, kommt es zu einem Integer Overflow und der Wert springt auf Integer.MIN_VALUE.
         */

        //Ausgaben
        System.out.println(alterInSekunden + "\n");
        System.out.println(0.1 + 0.2 );
        System.out.println(0.1 + 0.2 == 0.3);
        System.out.println(1 + 2 == 3);

        System.out.printf("%,d",maximaleGroesse);

        //Antwort auf Frage
        /*double kann bestimmte Dezimalzahlen nicht exakt darstellen, wodurch Rundungsfehler entstehen können.
        int speichert ganze Zahlen innerhalb seines Wertebereichs exakt, deshalb ist 1 + 2 == 3 tatsächlich true.
         */
    }
}
