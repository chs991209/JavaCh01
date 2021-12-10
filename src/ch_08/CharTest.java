package ch_08;

//char은 Minus num
//local variable : parameter
public class CharTest {
    public static void main(String[] args) {

        char ex1 = 'A';
        System.out.println(ex1);
        System.out.println((int)ex1);

        char ex2 = 66;
        System.out.println(ex2);
        System.out.println((char)ex2);

        int ex3 = 67;
        System.out.println(ex3);
        System.out.println((char)ex3);

        char ch = '\uD55C';

        System.out.println(ch);
    }
}
