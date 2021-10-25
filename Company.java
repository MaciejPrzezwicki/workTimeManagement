package pl.MaciejPrzezwicki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addEmployee() {
        System.out.println("Provide the name of the employee");
        String name = scanner.nextLine();

        System.out.println("Provide the surname of the employee");
        String surname = scanner.nextLine();

        System.out.println("Provide the country of origin of the employee");
        String countryOfOrigin = scanner.nextLine();

        System.out.println("Provide the type of contract of the employee");
        String typeOfContract = scanner.nextLine();

        System.out.println("Provide the position of the employee");
        String position = scanner.nextLine();

        System.out.println("Provide the phone number of the employee");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        Employee employee = new Employee(name, surname, countryOfOrigin, typeOfContract, position, phoneNumber);

        employees.add(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            employee.displayEmployeeInformation();
        }
    }
}
