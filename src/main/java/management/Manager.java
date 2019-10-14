package management;

import staff.Employee;

public class Manager extends staff.Employee {

    String deptName;

    public Manager(String name, int nationalInsuranceNumber, double salary , String deptName) {
            super(name, nationalInsuranceNumber, salary);
            this.deptName = deptName;

    }

    public String getDeptName() {
        return this.deptName;
    }
}
