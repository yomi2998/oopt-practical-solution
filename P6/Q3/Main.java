package P6.Q3;

public class Main {
    private static void printElements(Employee[] empArray) {
        for(Employee emp : empArray)
            System.out.println(emp.toString());
    }
    public static void main(String args[]) {
        Employee[] empArray = new Employee[3];
        empArray[0] = new Employee("John", 2010, 5000.00);
        empArray[1] = new CommissionEmployee(10000.00, 0.1);
        empArray[2] = new Clerk(500, 3, 50.00);

        printElements(empArray);
    }
}
