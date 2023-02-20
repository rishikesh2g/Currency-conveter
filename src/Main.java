import java.util.Scanner;

public class Main {
    // Define constants for conversion rates
    private static final double USD_TO_EUR = 0.93;
    private static final double USD_TO_INR = 82.43;
    private static final double USD_TO_NPR = 132.67;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount to convert
        System.out.print("Enter amount in USD: ");           //program prompts the user to enter an amount in USD using the Scanner class.
        double amount = scanner.nextDouble();

        // Display options for currency conversion          //program displays a menu of options to the user using print statements.
        System.out.println("1. Convert to Euro");
        System.out.println("2. Convert to Nepalese");
        System.out.println("3. Convert to  Indian Rupee");

        // Prompt the user to select a conversion option
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        double convertedAmount = 0;
        String currency_Name = "";

        // Use conditional statements to determine the currency to convert to based on user input
        if (option == 1) {
            convertedAmount = amount * USD_TO_EUR;
            currency_Name = "EUR";
        } else if (option == 2) {
            convertedAmount = amount * USD_TO_NPR;
            currency_Name = "NPR";
        } else if (option == 3){
            convertedAmount = amount * USD_TO_INR;
            currency_Name = "INR";
        }
        // Display the converted amount and currency name
        else {
            System.out.println("Invalid option");
        }
        System.out.println(amount + " USD is equal to " + String.format("%.2f", convertedAmount) + " " + currency_Name);    //String.format() method is used to format the output to two decimal places.
        //program uses variables, constants, and conditional statements
    }
}
