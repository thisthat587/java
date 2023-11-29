//Create a class to store the details of employee and print all the details including including net salary details: id,name,basic salary,TA,DA,PF
class employee {
    private int empId;
    private String name;
    private double basic_salary;
    private double TA;
    private double DA;
    private double PF;

    public employee(int empId, String name, double basic_salary, double TA, double DA, double PF) {
        this.empId = empId;
        this.name = name;
        this.basic_salary = basic_salary;
        this.TA = TA;
        this.DA = DA;
        this.PF = PF;
    }

    public double get_netSalary() {
        return basic_salary + TA + DA - PF;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee id  : " + empId);
        System.out.println("Name         : "+name);
        System.out.println("Basic Salary : Rs. "+basic_salary);
        System.out.println("TA           : Rs. "+TA);
        System.out.println("DA           : Rs. "+DA);
        System.out.println("PF           : Rs. "+TA);
        System.out.println("Net Salary   : Rs. "+get_netSalary());

    }
}

public class employeeDetails {
    public static void main(String[] args) {
        employee employee1 = new employee(1, "Akash kumar", 50000, 3500, 2500, 2000);
        employee1.printEmployeeDetails();

    }
}
