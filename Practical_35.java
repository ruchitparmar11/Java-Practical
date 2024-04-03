class Hellothread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello" + (i + 1));
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Worldthread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("World" + (i + 1));
            try {
                sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Practical_35 {
    public static void main(String[] args) {
        System.out.println("hello guys");
        Hellothread HD = new Hellothread();
        Worldthread WD = new Worldthread();
        HD.start();
        WD.start();
    }
}