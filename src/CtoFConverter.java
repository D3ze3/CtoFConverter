import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        // Input validation loop
        do {
            System.out.print("Enter a valid temperature in Celsius: ");
            while (!scanner.hasNextDouble()) { // Check for valid number
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.next(); // Clear invalid input
                System.out.print("Enter a valid temperature in Celsius: ");
            }
            celsius = scanner.nextDouble();
        } while (Double.isNaN(celsius)); // Extra check for safety

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);

        scanner.close();
    }
}
