package P6.Q3;

public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;

    Employee() {}

    Employee(String name, int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String toString() {
        return String.format("Name: %s\nYear Joined: %d\nBasic Salary: RM %.2f\n", name, yearJoined, basicSalary);
    }
}

class CommissionEmployee extends Employee {
    private double grossSale;
    private double CommissionRate;

    CommissionEmployee() {}

    CommissionEmployee(double grossSale, double CommissionRate) {
        this.grossSale = grossSale;
        this.CommissionRate = CommissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public double getCommissionRate() {
        return CommissionRate;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public void setCommissionRate(double CommissionRate) {
        this.CommissionRate = CommissionRate;
    }

    public String toString() {
        return String.format("Gross Sale: RM %.2f\nCommission Rate: %.2f\n", grossSale, CommissionRate);
    }

    public double calculateSalary() {
        return getBasicSalary() + grossSale * CommissionRate;
    }
}

class Clerk extends Employee {
    private double allowance;
    private int overtimeHours;
    private double overtimeRate;

    Clerk() {}

    Clerk(double allowance, int overtimeHours, double overtimeRate) {
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    public double getAllowance() {
        return allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public String toString() {
        return String.format("Allowance: RM %.2f\nOvertime Hours: %d\nOvertime Rate: RM %.2f\n", allowance, overtimeHours, overtimeRate);
    }

    public double calculateSalary() {
        return getBasicSalary() + allowance + (overtimeHours * overtimeRate);
    }
}