package Nov16;

import Nov12.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class ArraylistInteger {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(1000);
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.add(50);
        System.out.println(integerArrayList);

        integerArrayList.add(2, 25);
        System.out.println(integerArrayList);

        integerArrayList.set(2, 2345);
        System.out.println(integerArrayList);

        System.out.println(integerArrayList.contains(40));


    }
}
