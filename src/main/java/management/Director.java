package management;

public class Director extends management.Manager {

    private double budget;

    public Director(String name, int nationalInsuranceNumber, double salary, double budget, String deptName) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}
