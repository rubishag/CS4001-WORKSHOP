public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher(1, "Ms. Smith", 3000, "Mathematics", 5000);
        System.out.println("Teacher Annual Salary: $" + teacher.calculateAnnualSalary());
   
        Staff staff = new Staff(2, "Mr. Jones", 2000, 160, 25);
        System.out.println("Staff Salary: $" + staff.calculateSalary());

        System.out.println("College Name: " + Person.collegeName);
    }
}
