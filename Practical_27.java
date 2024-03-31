abstract class A {
    public abstract void display();
}

class A1 extends A {
    public void display() {
        System.out.println("This is A1's display method.");
    }
}

class A2 extends A {
    public void display() {
        System.out.println("This is A2's display method.");
    }
}

public class Practical_27 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.display();
        A2 a2 = new A2();
        a2.display();
    }
}