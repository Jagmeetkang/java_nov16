package nov19;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    static int stock =0;
    static String product;
    static int counter;
    static int div;
    public static void main(String[] args) {

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Laptop" , 100);
        map2.put("Mobile" , 150);
        map2.put("Mouse" , 250);
        map2.put("Keyboard" , 124);
        map2.put("Cables" , 29);



        for (Map.Entry<String, Integer> entries : map2.entrySet()){
            counter+=entries.getValue();
            div++;

            if(entries.getValue() > stock){
                stock=entries.getValue();
                product = entries.getKey();
            }

        }
        System.out.println(stock);
        System.out.println(product);
        System.out.println(counter/div);

    }
}
