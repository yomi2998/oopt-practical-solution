package P7.Q1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static double computeTotalCollection(ArrayList<PatientBill> patientBills) {
        double totalCollection = 0;
        for (PatientBill patientBill : patientBills) {
            totalCollection += patientBill.getTotal_charges();
        }
        return totalCollection;
    }

    public static void main(String args[]) {
        ArrayList<PatientBill> patientBills = new ArrayList<PatientBill>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        for (int i = 0; i < 4; ++i) {
            while (true) {
                System.out.print("Patient " + (i + 1) + "\n\n1. Inpatient\n2. Outpatient\nEnter choice: ");
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice < 1 || choice > 2) {
                        System.out.println("Invalid input, try again.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input, try again.");
                    continue;
                }
            }
            switch (choice) {
                case 1 -> {
                    InpatientBill patientBill = new InpatientBill();
                    System.out.print("Registration for InpatientBill " + (i + 1) + "\n\nEnter visit ID: ");
                    patientBill.setVisit_id(sc.nextLine());
                    System.out.print("Enter name: ");
                    patientBill.setName(sc.nextLine());
                    while (true) {
                        System.out.print("Enter specialist charges: RM ");
                        try {
                            patientBill.setSpecialist_charges(Double.parseDouble(sc.nextLine()));
                            if (patientBill.getSpecialist_charges() < 0)
                                throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input, try again.");
                            continue;
                        }
                    }
                    while (true) {
                        System.out.print("Enter lab charges: RM ");
                        try {
                            patientBill.setLab_charges(Double.parseDouble(sc.nextLine()));
                            if (patientBill.getLab_charges() < 0)
                                throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input, try again.");
                            continue;
                        }
                    }
                    while (true) {
                        System.out.print("Enter room type (S/P): ");
                        try {
                            patientBill.setRoom_type(sc.nextLine().charAt(0));
                            if (patientBill.getRoom_type() != 'S' && patientBill.getRoom_type() != 'P')
                                throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input, try again.");
                            continue;
                        }
                    }
                    while (true) {
                        System.out.print("Enter duration of stay: ");
                        try {
                            patientBill.setDuration_of_stay(Integer.parseInt(sc.nextLine()));
                            if (patientBill.getDuration_of_stay() <= 0)
                                throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input, try again.");
                            continue;
                        }
                    }
                    patientBill.setTotal_charges(patientBill.calculate_total_charges());
                    patientBills.add(patientBill);
                    System.out.println("------------------------------------------------------");
                }

                case 2 -> {
                    OutpatientBill patientBill = new OutpatientBill();
                    System.out.print("Registration for OutpatientBill " + (i + 1) + "\n\nEnter visit ID: ");
                    patientBill.setVisit_id(sc.nextLine());
                    System.out.print("Enter name: ");
                    patientBill.setName(sc.nextLine());
                    while (true) {
                        System.out.print("Enter consultation charges: RM ");
                        try {
                            patientBill.setConsultation_fees(Double.parseDouble(sc.nextLine()));
                            if (patientBill.getConsultation_fees() < 0)
                                throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input, try again.");
                            continue;
                        }
                    }
                    while (true) {
                        System.out.print("Enter registration charges: RM ");
                        try {
                            patientBill.setRegistration_fees(Double.parseDouble(sc.nextLine()));
                            if (patientBill.getRegistration_fees() < 0)
                                throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input, try again.");
                            continue;
                        }
                    }
                    patientBill.setTotal_charges(patientBill.calculate_total_charges());
                    patientBills.add(patientBill);
                    System.out.println("------------------------------------------------------");
                }
            }
        }
        System.out.println("Patient Bills\n");
        for (int i = 0; i < 4; ++i) {
            System.out.println("------------------------------------------------------");
            System.out.println("Patient " + (i + 1) + "\n");
            System.out.println("Visit ID: " + patientBills.get(i).getVisit_id());
            System.out.println("Name: " + patientBills.get(i).getName());
            System.out.printf("Total charges: RM %.2f\n", patientBills.get(i).getTotal_charges());
            System.out.println("------------------------------------------------------");
            System.out.println("Press enter to continue...");
            sc.nextLine();
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("Sum: RM %.2f\n", computeTotalCollection(patientBills));
    }
}