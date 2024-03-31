class Employee {
    private String empNo;

    public Employee( String empNo) {
        this.empNo = empNo;
    }

    public void work() {
        System.out.println("Working as an employee...");
    }

    public String getEmpNo() {
        return empNo;
    }
}

class Teaching extends Employee {
    private String nameOfSubject;

    public Teaching(String empNo, String nameOfSubject) {
        super(empNo);
        this.nameOfSubject = nameOfSubject;
    }

    public void work() {
        System.out.println("Teaching the subject " + nameOfSubject);
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }
}

class NonTeaching extends Employee {
    private String typeOfWork;

    public NonTeaching(String empNo, String typeOfWork) {
        super(empNo);
        this.typeOfWork = typeOfWork;
    }

    public void work() {
        System.out.println("Doing non-teaching work: " + typeOfWork);
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }
}

public class Practical_25 {
    public static void main(String[] args) {
        Teaching teacher1 = new Teaching("001", "Math");
        Teaching teacher2 = new Teaching("002", "Physics");
        NonTeaching nt1 = new NonTeaching("003", "Admin");
        NonTeaching nt2 = new NonTeaching("004", "Accounting");

        printDetail(teacher1);
        printDetail(teacher2);
        printDetail(nt1);
        printDetail(nt2);
    }

    public static void printDetail(Employee employee) {
        System.out.println("Employee Number: " + employee.getEmpNo());
        employee.work();
        System.out.println("------------------------");
    }
}