package JavaQes;


/*  Write a Java program to create a class Employee with a method called
calculateSalary().Create two subclasses Manager and Programmer. In each subclass,
override the calculateSalary() method to calculate and return the salary based on specific
roles. */



class Employee {

    // Method to calculate salary
    double calculateSalary() {
        return 0;
    }
}

// Subclass Manager
class Manager extends Employee {

    double calculateSalary() {
        double basicSalary = 50000;
        double bonus = 10000;

        return basicSalary + bonus;
    }
}

// Subclass Programmer
class Programmer extends Employee {

    double calculateSalary() {
        double basicSalary = 40000;
        double overtime = 5000;

        return basicSalary + overtime;
    }
}

// Main Class
public class  EmployeQ1{

    public static void main(String[] args) {

        Manager m = new Manager();
        Programmer p = new Programmer();

        System.out.println("Manager Salary: " + m.calculateSalary());

        System.out.println("Programmer Salary: " + p.calculateSalary());
    }
}