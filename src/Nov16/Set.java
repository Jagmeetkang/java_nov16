package Nov16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(10, 43, 53, 423, 34, 542, 423, 10, 4525, 23, 234, 32, 23, 53, 5643));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 43, 53, 423, 34, 542, 423, 10, 4525, 23, 234, 32, 23, 53, 5643));
        HashSet<Integer> set1 = new HashSet<>(list);



        System.out.println(set1);
    }
}
