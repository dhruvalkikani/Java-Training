public class Employee extends Person{

    private int empCode;
    private  String designation;
    private  float salary;

    public Employee(String name, int age, Address address, float salary, String designation, int empCode) {
        super(name, age, address);
        this.salary = salary;
        this.designation = designation;
        this.empCode = empCode;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

public void applyForLeave(){
    System.out.println("Applied For Leave");
}


    public void displayInfo(){
    super.displayInfo();
    System.out.println("Employee Code: " + empCode + " Designation: " + designation + " Salary: " + salary);


    }


}
