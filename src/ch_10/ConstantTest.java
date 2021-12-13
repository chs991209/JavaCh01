package ch_10;

//Declare 부분만 Replace
public class ConstantTest {
    public static void main(String[] args) {

        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 20;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        int iNum = 100;
        byte bNum = (byte) iNum;
        System.out.println(bNum);

        double sNum = 3.141592;
        int dNum = (int) sNum;
        System.out.println(dNum);
    }
}
