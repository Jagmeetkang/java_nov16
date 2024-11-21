package nov19;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Microsoft","Satya Nadella");
        map.put("Tesla","Elon Musk");
        map.put("Google","Sundar Pichai");
        map.put("Pragra","Atin Singh");



        System.out.println(map.entrySet());
        System.out.println();

        System.out.println(map.keySet());
        System.out.println();

        System.out.println(map.values());
        System.out.println();

        for(Map.Entry entries : map.entrySet()){
            System.out.println("Key " + entries.getKey() + " Value " + entries.getValue());
            System.out.println();
            System.out.println();
        }
    }
}
