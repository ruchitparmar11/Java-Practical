package mypack;

class ClassOne {
    public String getClassOneString() {
        return "This is my first class..!";
    }
}

class ClassTwo {
    public String getClassTwoString() {
        return "This is my second class..!";
    }
}

class ClassThree {
    public String getClassThreeString() {
        return "This is my third class..!";
    }
}

public class Practical_29 {
    public static void main(String[] args) {
        ClassOne One = new ClassOne();
        ClassTwo Two = new ClassTwo();
        ClassThree Third = new ClassThree();

        System.out.println(One.getClassOneString());
        System.out.println(Two.getClassTwoString());
        System.out.println(Third.getClassThreeString());
    }
}