public class Employee {

    private String employeeName;
    private String designation;
    private int salary;
    private String address;
    private int age;

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setAge(int age){
        if(age > 100){
            System.out.println("httttttttttt");
        }else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayEmployeeDetails(){
        System.out.println("Name  -"+employeeName);
        System.out.println("Designation - "+designation);
        System.out.println("Salary -"+salary);
        System.out.println("Address - "+address);
        System.out.println("Age - "+age);
    }

    public void printEmployeeNameNoOfTimes(int numberOfTimes){
      /*  int n = 1;

        while(n <= numberOfTimes){
            System.out.println(employeeName);
            n++;
        }*/

       /* for(int n = 1; n <= numberOfTimes; n++){
            System.out.println(employeeName);
        } */
        int n = 1;
        do{
            System.out.println(employeeName);
            n++;
        }while(n <= numberOfTimes);
    }

}
