package ch_15;

public class IfElseIfTest {
    public static void main(String[] args) {

        int age = 12;
        int charge;

        if ( age < 8 ) {
            charge = 10;
            System.out.println("Child");
        }
        else if ( age < 14 ) {
            charge = 15;
            System.out.println("Elementary School");
        }
        else if ( age < 20 ) {
            charge = 25;
            System.out.println("Mid/High School");
        }
        else {
            charge = 30;
            System.out.println("Adult");
        }

        System.out.println("The charge is " + charge + "$" );
    }

}
