//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Employee emp = new Employee();

      // emp.address = "Gurgaon";
      // emp.salary = 12000;
      // emp.designation = "HR";
      // emp.employeeName = "Reena";
       // emp.age = 1000;
        emp.setEmployeeName("Rahul");
        emp.setDesignation("Dev");
        emp.setAddress("Mumbai");
        emp.setSalary(2000);
        emp.setAge(98);

       //emp.displayEmployeeDetails();
        emp.printEmployeeNameNoOfTimes(5);
    }
}