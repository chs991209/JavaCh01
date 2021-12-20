package ch_03;


// #1 num1, num2, result 스택 메모리 생성
// #2 n1, n2, total 스택 메모리 생성
// #3 total 반환 후 #2 스택 메모리 삭제

public class FunctionTest {

    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calculateSum() {
        int sum = 0;
        int i;
        for (i = 0; i <= 100; i++) {
            sum += i;

        }

        return sum;
    }

    public static void main(String[] args){
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("Hi");

        total = calculateSum();
        System.out.println(total);
    }
}
