package staff;

public abstract class Employee {
    private String name;
    private int nationalInsuranceNumber;
    private double salary;

    public Employee(String name, int nationalInsuranceNumber, double salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double toRaiseBy) {
        return salary += toRaiseBy;
    }

    public double payBonus(double salary) {
        return salary / 100;
    }


}
