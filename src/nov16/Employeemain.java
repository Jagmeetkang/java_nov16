package nov16;

import java.util.ArrayList;
import java.util.List;

public class Employeemain {
    public static void main(String[] args) {

        Employee E1 = new Employee("Ankit", "Ankit@gmail.com", 25, 9055, "Canada");
        Employee E2 = new Employee("Amit", "Amit@gmail.com", 25, 9056, "Canada");
        Employee E3 = new Employee("Rohit", "Rohit@gmail.com", 26, 9057, "India");
        Employee E4 = new Employee("Virat", "Virat@gmail.com", 27, 9058, "India");

        System.out.println("Hello World");

        List<Employee> List = new ArrayList<>();
        List.add(E1);
        List.add(E2);
        List.add(E3);
        List.add(E4);

        System.out.println(E1.getCountry());


    }
}

