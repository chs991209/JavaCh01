package ch_13;

import java.util.Scanner;

public class ConitionTest {

    public static void main(String[] args) {

        int max;
        System.out.println("Print the bigger Integer\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Import No1:");
        int num1 = scanner.nextInt();
        System.out.println("Import No2:");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);

        int integ = 5;
        System.out.println(integ << 2);

    }
}
