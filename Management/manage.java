class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000.0;
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing HR tasks.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class manage {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        System.out.println("Employee's salary: $" + emp.getSalary());
        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee();
        System.out.println("HR Manager's salary: $" + hrManager.getSalary());
    }
}
