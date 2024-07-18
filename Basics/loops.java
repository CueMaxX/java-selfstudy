package Basics;

public class loops {
    public static void main(String[] args) {
        int value = 10;

        while (value > 0) {
            System.out.println("Hello! Current value: " + value);
            value -= 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello! Current value: " + i);
        }

    }
}
