import java.util.Scanner;

public class Main {
    private static final double USD_TO_EUR = 0.93;
    private static final double USD_TO_INR = 82.43;
    private static final double USD_TO_NPR = 132.67;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double amount = scanner.nextDouble();
        System.out.println("1. Convert to Euro");
        System.out.println("2. Convert to Nepalese");
        System.out.println("3. Convert to  Indian Rupee");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        double convertedAmount = 0;
        String currency_Name = "";

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



        else {
            System.out.println("Invalid option");
        }
        System.out.println(amount + " USD is equal to " + String.format("%.2f", convertedAmount) + " " + currency_Name);
    }
}
