public class Main {
    public static void main(String[] args) {
//        Address address = new Address(111, "Maha", "Mumbai");
//        Address address1 = new Address(101, "Maha", "Bombay");
//
//        Employee employee = new Employee("Aryan", 25, address, 11000f, "GET", 1);
//        Student student = new Student("Dhuval", 15, address1, 12, "A");
//
//        employee.displayInfo();
//        employee.applyForLeave();
//
//        student.displayInfo();
        int sum =0;
        for (String arg : args){
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum: " + sum);

    }
}
