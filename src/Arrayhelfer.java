public class Arrayhelfer {
    static void main() {
        int[] werte = {1, 2, 23, 65, 48, 9};
        System.out.println(summe(werte));
        System.out.println(minimum(werte));
        System.out.println(maximum(werte));
        System.out.println(durchschnitt(summe(werte),werte));
        System.out.println(enthaelt(werte,1));
    }

    static int summe(int[] werte) {
        int summe = 0;
        for (int wert : werte) {
            summe = summe + wert;
        }
        return summe;
    }
    static int minimum (int[]werte){
        int min = werte[0];
        for (int wert : werte) {
            if (wert < min) {
                min = wert;
            }
        }
        return min;
    }
    static int maximum (int[]werte){
        int max = werte[0];
        for (int wert : werte) {
            if (wert > max) {
                max = wert;
            }
        }
        return max;
    }

    static double durchschnitt(int summe,int [] werte){
        double durchschnitt = summe / werte.length;
        return durchschnitt;
    }
    static boolean enthaelt(int[]werte,int gesucht){
        boolean istEnthalten = false;
        for (int wert:werte){
            if (wert == gesucht){
                istEnthalten = true;
            }
        }
        return istEnthalten;
    }

}
