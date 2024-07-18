package Basics;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for countdown.");
        int n = sc.nextInt();
        do {
            System.out.println(n);
            n--;
        } while (n >= 0);
    }
}
