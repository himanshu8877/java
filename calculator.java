import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Basic Calculator");
        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1) Add (+)");
            System.out.println("2) Subtract (-)");
            System.out.println("3) Multiply (*)");
            System.out.println("4) Divide (/)");
            System.out.println("5) Quit");
            System.out.print("Enter choice (1-5): ");

            String choice = sc.nextLine().trim();
            if (choice.equals("5") || choice.equalsIgnoreCase("q") || choice.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye.");
                break;
            }

            if (!choice.matches("[1-4]")) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            double a, b;
            try {
                System.out.print("Enter first number: ");
                a = Double.parseDouble(sc.nextLine().trim());
                System.out.print("Enter second number: ");
                b = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            double result = 0;
            switch (choice) {
                case "1":
                    result = a + b;
                    System.out.println(a + " + " + b + " = " + result);
                    break;
                case "2":
                    result = a - b;
                    System.out.println(a + " - " + b + " = " + result);
                    break;
                case "3":
                    result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                    break;
                case "4":
                    if (b == 0) {
                        System.out.println("Error: Division by zero.");
                    } else {
                        result = a / b;
                        System.out.println(a + " / " + b + " = " + result);
                    }
                    break;
            }
        }
        sc.close();
    }
}
