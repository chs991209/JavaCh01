package ch_13;

public class BitOperationTest {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        int num3 = 0;

        System.out.println(num1 ^ num3);
        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println( ~num1 );

        System.out.println(num1 << 2);
        System.out.println(num1 >>= 1);


    }
}
