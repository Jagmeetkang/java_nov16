package nov12;

import java.util.ArrayList;

public class EmployeeArrayList {

    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();


        Employee employee1 = new Employee(1,"John",10000);
        Employee employee2 = new Employee(2,"Peter",20000);
        Employee employee3= new Employee(3,"Sam",30000);
        Employee employee4= new Employee(4,"Mary",40000);


//        System.out.println(employee1);
//        System.out.println(employee2);
//        System.out.println(employee3);

        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        System.out.println(employeeArrayList);

        System.out.println(employeeArrayList.get(2));



    }








}
