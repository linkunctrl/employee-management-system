import java.util.*;

public class employee_manage {
    public static void main(String[] args) {

        

        // Create an Employee object using the constructor
        employee emp1 = new employee("Alina", 19, 3000);

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Age: " + emp1.getAge());
        System.out.println("Salary: " + emp1.getSalary());

        // Modify values using setters
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIs this information correct? (Y/N) ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("N")) {
            System.out.println("\nEnter name: ");
            String name = scanner.nextLine();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();

            System.out.println("Enter salary: ");
            double salary = scanner.nextDouble();

            emp1.setName(name);
            emp1.setAge(age);
            emp1.setSalary(salary);

            System.out.println("\nUpdated Employee Details:");
            System.out.println("Name: " + emp1.getName());
            System.out.println("Age: " + emp1.getAge());
            System.out.println("Salary: " + emp1.getSalary());
        } else {
            System.out.println("Goodbye!");
        }

        // Close the scanner
        scanner.close();
    }
}

