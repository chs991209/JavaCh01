package ch_12;

public class LogicalTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        boolean value = (num1 > num2);
        System.out.println(value);
        System.out.println(num1< num2);

        int Num1 = 10;
        int i = 2;

        boolean val = ( (num1 = num1 + 10) <= 15 && ( (i = i+2) <10 ) );
//        boolean val2 = ( (num1 = num1 + 10) > 15 || ( (i = i + 2) < 10) );

        System.out.println(val);
        System.out.println(Num1);
        System.out.println(i);
//        System.out.println(val2);
    }
}
