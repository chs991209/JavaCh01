package ch_11;

public class OperatorTest {
    public static void main(String[] args) {
//        a [lValue] = 5 [rValue] ;
// rValue의 값이 정해지고 난 후에 lValue에 =로 대입 >> = 대입연산자는 연산 우선순위가 낮다

//        int myNum = 10;
//        int yourNum = 20;
//
//        myNum += yourNum;
//        System.out.println(myNum);

        int gameScore = 150;

        int lastScore = gameScore++;

        System.out.println(lastScore);
        System.out.println(gameScore);


    }
}
