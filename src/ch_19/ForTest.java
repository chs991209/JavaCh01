package ch_19;


//for 문의 문장 생략 가능 경우
// #1
// 변수의 값이 이전에 초기화 돼서 내부에서 값을 지정할 필요가 없는 경우

// #2
// for 문의 수행 조건이 수행문 내부에 있는 경우

// #3
// 반복 수행문의 증감식에 대한 연산이 복잡하거나 다른 변수의 연산 결과값에 의해 결정되는 경우

public class ForTest {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        for (int i = 0; i < 10; i++, count++) {
            sum += count;

        }
        System.out.println(sum);

        int num = 1;
        int total = 0;

        while( num <= 10 ) {
            total += num;
            num++;
        }
        System.out.println(total);

//        CASE 1

        int i = 0;
        int sum1 = 0;
        for (; i < 5; i++) {
            sum1 += i;
        }
        System.out.println(sum1);


//        CASE 2
        int i1;
        int sum2 = 0;

        for (i1 = 0; ; i1++ ) {
            sum2 += i;
            if( sum2>211) break;
        }
        System.out.println(sum2);

//        CASE 3
        int i3;
        int sum3 = 0;

        for (i3 = 0; i3 < 5; ) {

            i3 = (++i3) % 10;
            sum3 += i3;
        }
        System.out.println(sum3);
    }
}


