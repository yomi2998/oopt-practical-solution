package P4.Q1;

////Q1a
//public class Employee {
//    String name;
//    double salary;
//    
//    Employee(String employeeName, double currentSalary) {
//        name = employeeName;
//        salary = currentSalary;
//    }
//    
//    void raiseSalary(double percent) {
//        salary = salary + (salary * percent / 100.0);
//    }
//    public static void main(String args[]) {
//        Employee emp = new Employee("Noob", 69420.00);
//        System.out.println("Before raise salary: " + emp.salary);
//        emp.raiseSalary(8);
//        System.out.println("After raise salary: " + emp.salary);
//    }
//}

////Q1b
//public class Employee {
//
//    private String name;
//    private double salary;
//
//    public void raiseSalary(double percent) {
//        salary = salary + (salary * percent / 100.0);
//    }
//
//    public void setSalary(double s) {
//        salary = s;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setName(String n) {
//        name = n;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public static void main(String args[]) {
//        Employee emp = new Employee();
//        emp.setName("Noob");
//        emp.setSalary(69420.0);
//        System.out.println("Before raise salary: " + emp.getSalary());
//        emp.raiseSalary(8);
//        System.out.println("After raise salary: " + emp.getSalary());
//    }
//}
//Q1c
public class Employee {

    private String name;
    private double salary;

    public Employee() {
        name = "";
        salary = 0.0;
    }

    public Employee(String n) {
        name = n;
        salary = 0.0;
    }

    public void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100.0);
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
