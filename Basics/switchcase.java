package Basics;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;
            case 3:
                System.out.println("number is 3");
                break;
            case 4:
                System.out.println("number is 4");
                break;
        }
    }
}
