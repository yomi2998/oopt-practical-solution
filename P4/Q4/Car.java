package P4.Q4;

public class Car {
    private static int regNo = 1000;
    private int thisRegNo;
    private Owner owner = new Owner();
    private String plateNo;
    private String color;
    private int year;
    private String make;
    private String model;
    private double capacity;

    public Car() {
        regNo++;
        thisRegNo = regNo;
    }

    public int getRegNo() {
        return thisRegNo;
    }

    public void setOwnerName(String ownerName) {
        this.owner.setOwnerName(ownerName);
    }

    public void setOwnerIC(String ownerIC) {
        this.owner.setOwnerIC(ownerIC);
    }

    public String getOwnerName() {
        return this.owner.getOwnerName();
    }

    public String getOwnerIC() {
        return this.owner.getOwnerIC();
    }

    public String getPlateNo() {
        return this.plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        return String.format("%-10d%-30s%-15s%-10s%-7s%-5d%-15s%-15s%-10.1f", getRegNo(), owner.getOwnerName(),
                owner.getOwnerIC(), getPlateNo(), getColor(), getYear(), getMake(), getModel(), getCapacity());
    }
}