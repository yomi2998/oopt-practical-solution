package P7.Q1;

public abstract class PatientBill {
    protected String visit_id;
    protected String name;
    protected double total_charges;

    public abstract double calculate_total_charges();

    public String getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(String visit_id) {
        this.visit_id = visit_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal_charges() {
        return total_charges;
    }

    public void setTotal_charges(double total_charges) {
        this.total_charges = total_charges;
    }
}

class OutpatientBill extends PatientBill {
    private static double registration_fees = 30.00;
    private double consultation_fees;

    public double getRegistration_fees() {
        return registration_fees;
    }

    public void setRegistration_fees(double registration_fees) {
        OutpatientBill.registration_fees = registration_fees;
    }

    public double getConsultation_fees() {
        return consultation_fees;
    }

    public void setConsultation_fees(double consultation_fees) {
        this.consultation_fees = consultation_fees;
    }

    public String getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(String visit_id) {
        this.visit_id = visit_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal_charges() {
        return total_charges;
    }

    public void setTotal_charges(double total_charges) {
        this.total_charges = total_charges;
    }

    @Override
    public double calculate_total_charges() {
        return registration_fees + consultation_fees;
    }
    
}

class InpatientBill extends PatientBill {
    private double specialist_charges;
    private double lab_charges;
    private char room_type;
    private int duration_of_stay;
    private static double room_rate = 500.00;

    public double getSpecialist_charges() {
        return specialist_charges;
    }

    public void setSpecialist_charges(double specialist_charges) {
        this.specialist_charges = specialist_charges;
    }

    public double getLab_charges() {
        return lab_charges;
    }

    public void setLab_charges(double lab_charges) {
        this.lab_charges = lab_charges;
    }

    public char getRoom_type() {
        return room_type;
    }

    public void setRoom_type(char room_type) {
        this.room_type = room_type;
        if(room_type == 'S')
            room_rate = 100.00;
        else if(room_type == 'P')
            room_rate = 200.00;
    }

    public int getDuration_of_stay() {
        return duration_of_stay;
    }

    public void setDuration_of_stay(int duration_of_stay) {
        this.duration_of_stay = duration_of_stay;
    }

    public static double getRoom_rate() {
        return room_rate;
    }

    public static void setRoom_rate(double room_rate) {
        InpatientBill.room_rate = room_rate;
    }

    @Override
    public double calculate_total_charges() {
        double room_charges = duration_of_stay * room_rate;
        return specialist_charges + lab_charges + room_charges;
    }
}