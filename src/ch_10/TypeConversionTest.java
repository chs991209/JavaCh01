package ch_10;

// n byte : 8 X n bit >> (+- 부호) 1 bit + (8 X n -1) bit
public class TypeConversionTest {
    public static void main(String[] args) {

//        byte bNum = 125;
//        int iNum = bNum;
//
////        더 적은 범위의 정보를 가진, 더 적은 byte를 차지하는 Type으로 Error 없이 강제 TypeCasting (byte), (int), ...)
//
//        int jNum = 250;
//        byte kNum = (byte) jNum;
//        System.out.println(kNum);
//
//        System.out.println(iNum);
//        byte Num = -128;
//        byte sNum = 127;
//        System.out.println(Num);
//        System.out.println(sNum);
//
//        double dNum = 3.141592;
//        int mNum = (int) dNum;
//        System.out.println(mNum);
//

//        더 적은 byte의 Type으로 TypeCasting하여 연산하면,
//        어느 대상을 Casting하느냐에 따라 값이 매번 달라질 확률이 높음

        double dNum = 1.12;
        float fNum = 0.9F;
        int iNum1 = (int) dNum + (int) fNum;
        int iNum2 = (int) (dNum + fNum);
        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
