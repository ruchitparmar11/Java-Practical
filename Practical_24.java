import java.util.Scanner;

public class Practical_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[2];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Salary: ");
            int salary = sc.nextInt();

            employees[i] = new Employee(name, age, i + 1, salary);
            sc.nextLine(); // consume newline
        }

        System.out.println("**** Employee Details ****");

        sc.close();
    }
}

class Employee {
    String name;
    int age;
    int empNo;
    int salary;

    Employee(String name, int age, int empNo, int salary) {
        this.name = name;
        this.age = age;
        this.empNo = empNo;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee No.: " + empNo);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }
}