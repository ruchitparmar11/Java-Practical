import java.util.Scanner;

public class Practical_21 {
    String name;
    int age;
    int salary;
    public void getData() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name of Person : ");
            name = sc.nextLine();
            System.out.print("Enter Age of : ");
            age = sc.nextInt();
            System.out.print("Enter Salary of : ");
            salary = sc.nextInt();
        }
    }

    public void setData(String name, int age, int salary) {
        System.out.println("Name of Person is : " + name);
        System.out.println("Age of " + name + " is : " + age);
        System.out.println("Salary of " + name + " is : " + salary);
    }

    public static void main(String[] args) {
        Practical_21 pr = new Practical_21();
        pr.getData();
        System.out.println();
        System.out.println();
        pr.setData(pr.name, pr.age, pr.salary);
    }
}