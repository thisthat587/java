
abstract class people {

    private int empId;
    private String name;
    private String designation;
    private double salary;

    public people() {
    }

    public people(int empId, String name, String designation, double salary) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void show() {
        System.out.println("hello....");
    }

    void showEmployeeDetails() {
        System.out.println("\n\nEmployee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Designation : " + designation);
        System.out.println("Employee Salary : " + salary + "\n\n");
    }
}

class waiters extends people {
    waiters() {}

    waiters(int id, String name, String designation, double salary) {
        super(id, name, designation, salary);
    }
    super.show();
    void show() {
        System.out.println("hello....");
    }
}

public class Employee {
    public static void main(String[] args) {
        waiters w= new waiters(1,"rahim","waiter",15000);
        w.showEmployeeDetails();
    }
}
