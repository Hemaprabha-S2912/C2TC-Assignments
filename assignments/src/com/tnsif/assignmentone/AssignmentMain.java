import com.tnsif.assignmentone.employees.*;
import com.tnsif.assignmentone.utilities.*;

public class AssignmentMain {

    public static void main(String[] args) {
        Manager m1 = new Manager("Priya", 101, 75000, "HR");
        Developer d1 = new Developer("Kiran", 102, 65000, "Java");

        EmployeeUtilities util = new EmployeeUtilities();

        System.out.println("Before Salary Increment:");
        util.displayEmployee(m1);
        util.displayEmployee(d1);

        util.increaseSalary(m1, 10);
        util.increaseSalary(d1, 15);

        System.out.println("After Salary Increment:");
        util.displayEmployee(m1);
        util.displayEmployee(d1);
    }
}
