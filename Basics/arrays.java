package Basics;

public class arrays {
    public static void main(String[] args) {
        int[] values;
        values = new int[10];
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        String[] words = new String[3];
        words[0] = "Hello";
        words[1] = "World";
        words[2] = "Java";
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);

        String[] fruits = {"apple", "orange", "banana", "apple", "orange", "banana"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
