import java.util.Scanner;

public class Temperatur {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Grad Celsius? ");
        int celsius = Integer.parseInt(scanner.nextLine().trim());

       // int fahrenheit = celsius * 9 / 5 + 32;

        double fahrenheit2 = (double) celsius * 9 / 5 + 32;

        //System.out.println("Fahrenheit: " + fahrenheit + "\nFahrenheit 2: " + fahrenheit2);

        System.out.printf("Fahrenheit: %.1f",fahrenheit2);


    }
}
