public class Staff extends Person {
    double workingHours;
    double ratePerHour;
    public Staff(int id, String name, double basicSalary, double workingHours, double ratePerHour) {
        super(id, name, basicSalary);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }
    public double calculateSalary() {
        return workingHours * ratePerHour;
    }
}
