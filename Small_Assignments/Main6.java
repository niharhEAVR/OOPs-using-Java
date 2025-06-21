class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class Main6 {
    public static void main(String[] args) {
        Officer officer = new Officer();
        officer.name = "John Doe";
        officer.age = 30;
        officer.phoneNumber = "1234567890";
        officer.address = "123 Street, City";
        officer.salary = 50000;
        officer.specialization = "IT";

        Manager manager = new Manager();
        manager.name = "Jane Smith";
        manager.age = 40;
        manager.phoneNumber = "9876543210";
        manager.address = "456 Avenue, City";
        manager.salary = 80000;
        manager.department = "HR";

        System.out.println("Officer Details:");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone Number: " + officer.phoneNumber);
        System.out.println("Address: " + officer.address);
        System.out.println("Specialization: " + officer.specialization);
        officer.printSalary();

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}
