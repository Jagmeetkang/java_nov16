package oct15;

public class Test {
    public static void main(String[] args) {
        String s1 = "Pragra";
        String s2 = "Pragra";
        String s3 = new String("Pragra");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        char[] charArray = s1.toCharArray();
        for (char element : charArray){
            System.out.print(" " + element);
        }
    }
}
