import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zad.7 Przeliczanie stopni Fahrenheita na Celciusza i odwrotnie
        // (°C x 9/5) + 32 = °F
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the celcius value: ");
        double celsius1 = scanner.nextDouble();
        double fahrenheit1 = (celsius1*9/5)+32;
        System.out.println("The Fahrenheit value is: "+fahrenheit1);

        //(°F - 32) x 5/9 = °C
        System.out.println("Enter the Fahrenheit value: ");
        double fahrenheit2 = scanner.nextDouble();
        double celsius2 = (fahrenheit2 - 32)*5/9;
        System.out.println("The Celsius value is: "+celsius2);

    }
}