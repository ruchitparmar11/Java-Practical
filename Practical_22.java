import java.util.Scanner;

public class Practical_22 {
    String name;
    int enroll;
    int marks;

    Practical_22() {
        this.name = "Ruchit";
        this.enroll = 2101201;
        this.marks = 600;
    }

    Practical_22(String name, int enroll, int marks) {
        this.name = name;
        this.enroll = enroll;
        this.marks = marks;
    }

    public void display() {
        System.out.println(name);
        System.out.println(enroll);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of Student : ");
        String name = sc.nextLine();
        System.out.print("Enter Enrollment No. : ");
        int enroll = sc.nextInt();
        System.out.print("Enter Total Marks : ");
        int marks = sc.nextInt();
        Practical_22 p1 = new Practical_22();
        Practical_22 p2 = new Practical_22(name, enroll, marks);
        System.out.println();
        System.out.println("Before Updating : ");
        System.out.println();
        p1.display();
        System.out.println();
        System.out.println("After Updating : ");
        System.out.println();
        p2.display();
        sc.close();
    }
}