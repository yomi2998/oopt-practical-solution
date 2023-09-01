package P4.Q1;

public class Main {
    public static void main(String args[]) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Test");

        System.out.println("Employee 1:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.printf("\n");
        System.out.println("Employee 2:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Salary: " + emp2.getSalary());
        System.out.printf("\n");

        if (emp1.getSalary() > emp2.getSalary()) {
            System.out.println("Employee 1 has higher salary than Employee 2.");
        } else if (emp2.getSalary() > emp1.getSalary()) {
            System.out.println("Employee 2 has higher salary than Employee 1.");
        } else {
            System.out.println("Both Employee 1 and Employee 2 has equal salary.");
        }
    }
}
