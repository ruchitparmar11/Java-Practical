import java.lang.Exception;

class ArgumentGreaterthenOne extends Exception {
    ArgumentGreaterthenOne(String A) {
        super(A);
    }
}

public class Practical_30 {
    public static void main(String[] args) {
        System.out.println("Enter the main method");
        try {
            if (args.length > 1) {
                throw new ArgumentGreaterthenOne("Can't enter more then one argument");
            } else {
                System.out.println("One Argument: " + args[0]);
            }
        } catch (ArgumentGreaterthenOne a) {
            System.out.println(a.getMessage());
        }
        System.out.println("Exit the main mrthod");
    }
}