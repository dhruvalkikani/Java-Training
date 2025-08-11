import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Java Collection examples

        //ArrayList
        ArrayList<String> students = new ArrayList<>();
        students.add("Amit");
        students.add("Neha");
        students.add("Ravi");
        System.out.println(students); // [Amit, Neha, Ravi]
        System.out.println(students.get(1));

//      LinkedList
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Write report");
        tasks.add("Email client");
        tasks.addFirst("Attend meeting");
        System.out.println(tasks);


//      HashSet
        HashSet<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("India"); // duplicate ignored
        System.out.println(countries);

        HashSet<com.masai.entity.Employee> employee = new HashSet<>();
        employee.add(new com.masai.entity.Employee(70000 ,"Developers","Alice"));
        employee.add(new com.masai.entity.Employee(50000 ,"Tester","Blice"));

//      PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        while(!pq.isEmpty()) {

            System.out.println(pq.poll());

            ArrayDeque<String> dq = new ArrayDeque<>();
            dq.add("First");
            dq.addLast("Second");
            dq.addFirst("Zero");
            System.out.println(dq); // [Zero, First, Second]
        }


        //HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Amit");
        map.put(102, "Neha");
        map.put(103, "Ravi");

        System.out.println(map.get(102));
        System.out.println(employee.size());
    }
}