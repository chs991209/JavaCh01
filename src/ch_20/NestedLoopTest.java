package ch_20;


// for 문 a회 중첩당 O(n^a) 의 복잡도를 가진다
// 보통 2회를 넘게 중첩하지 않음

// for 문은 초기화식이 존재하고,
// while 문은 초기화 식이 조건에 없으므로 초기화식을 추가로 작성해야 한다.

public class NestedLoopTest {
    public static void main(String[] args) {
        int dan = 2;
        int count = 1;

//    for( ; dan <= 9; dan++){
//
//        for (count = 1; count <=9; count++) {
//            System.out.println( dan + " X " + count + " = " + dan * count);
//        }
//        System.out.println();
//        }

        while (dan <= 9) {
            count = 1;
            while (count <= 9) {

                System.out.println( dan + " X " + count + " = " + dan * count);
                count++;
            }

            dan++;
            System.out.println();

/*        int dan = 9;
        int count = 1;

        for (; count <= 2000000L; count++) {
            System.out.println(dan*count);
        }*/
            
        }
    }
}