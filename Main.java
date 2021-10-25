package pl.MaciejPrzezwicki;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Company company = new Company();

        while(shouldContinue){
            System.out.println("Select an option");
            System.out.println("1. Display employees");
            System.out.println("2. Add an employee");
            System.out.println("3. Display projects");
            System.out.println("4. Select an option ");
            System.out.println("5. EXIT");


            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> company.displayEmployees();
                case 2 -> company.addEmployee();
                case 3 -> System.out.println("option #3 was selected");
                case 4 -> System.out.println("option #4 was selected");
                case 5 -> shouldContinue = false;
            }
        }
    }
}
