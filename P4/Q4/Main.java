package P4.Q4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Deque<Car> carlist = new LinkedList<>();

        while (true) {
            Car car = new Car();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter car details (#" + car.getRegNo() + "):");
            System.out.print("Enter owner's name: ");
            car.setOwnerName(s.nextLine());
            System.out.print("Enter owner's IC: ");
            car.setOwnerIC(s.nextLine());
            System.out.print("Enter car's plate number: ");
            car.setPlateNo(s.nextLine());
            System.out.print("Enter car's color: ");
            car.setColor(s.nextLine());
            System.out.print("Enter car's brand: ");
            car.setMake(s.nextLine());
            System.out.print("Enter car's model: ");
            car.setModel(s.nextLine());
            System.out.print("Enter car's manufactured year: ");
            car.setYear(s.nextInt());
            System.out.print("Enter car's capacity: ");
            car.setCapacity(s.nextDouble());
            carlist.add(car);
            System.out.print("Register another car (Y/N)? ");
            char character = s.next().charAt(0);
            if (Character.toUpperCase(character) == 'N') {
                break;
            }
            s.close();
        }
        if (carlist.size() > 0) {
            System.out.println("                                           Car Registration Listing");
            System.out.printf("%-10s%-30s%-15s%-10s%-7s%-5s%-15s%-15s%-10s\n", "Reg No.", "Name", "IC No.",
                    "Plate No.", "Color", "Year", "Make", "Model", "Capacity");
            for(Car car : carlist) {
                System.out.println(car.toString());
            }
        }
    }
}
