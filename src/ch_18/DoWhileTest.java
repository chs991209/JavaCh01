package ch_18;


//while 문의 코드상 순서가 Do while 문으로도 원하는 알고리즘을 동일하게 만들 수 있는 구조일 때, Do while 문의 사용이 가능하다.
// input = 1일 때, sum += input을 실행해도 될 때

import java.util.Scanner;


public class DoWhileTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input;
        int sum = 0;


        do {
            input = scanner.nextInt();
            sum += input;


        } while (input != 1);
        System.out.println(sum);
    }
}

// input = 1일 때 sum += input을 실행하면 안될 때

//Scanner scanner = new Scanner(System.in);
//
//        int input;
//        int sum = 0;
//        input = scanner.nextInt();
//
//        while (input != 1) {
//
//            sum += input;
//            input = scanner.nextInt();
//
//        }
//        System.out.println(sum);