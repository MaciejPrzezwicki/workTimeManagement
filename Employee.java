package pl.MaciejPrzezwicki;

public class Employee {
    private String name;
    private String surname;
    private String countryOfOrigin;
    private String typeOfContract;
    private String position;
    private int phoneNumber;

    public Employee(String name, String surname, String countryOfOrigin, String typeOfContract, String position, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.countryOfOrigin = countryOfOrigin;
        this.typeOfContract = typeOfContract;
        this.position = position;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

    public String getPosition() {
        return position;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void displayEmployeeInformation() {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("type of contract: " + typeOfContract);
        System.out.println("position: " + position);
        System.out.println("phone number " + phoneNumber);
        System.out.println(" ");
    }
}

