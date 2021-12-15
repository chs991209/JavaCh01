package ch_16;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        String monthabrev = "";

        int day;
        switch (month){

            case 1:
                monthabrev = "Jan";
                day = 31;
                break;
            case 2:
                monthabrev = "Feb";
                day = 28;
                break;
            case 3:
                monthabrev = "Mar";
                day = 31;
                break;
            case 4:
                monthabrev = "Apr";
                day = 30;
                break;
            case 5:
                monthabrev = "May";
                day = 31;
                break;
            case 6:
                monthabrev = "June";
                day = 30;
                break;
            case 7:
                monthabrev = "July";
                day = 31;
                break;
            case 8:
                monthabrev = "Aug";
                day = 31;
                break;
            case 9:
                monthabrev = "Sept";
                day = 30;
            case 10:
                monthabrev = "Oct";
                day = 31;
                break;
            case 11:
                monthabrev = "Nov";
                day = 30;
                break;
            case 12:
                monthabrev = "Dec";
                day = 31;
                break;
            default:
                System.out.println("Not an Existing Month");
                day = -1;

        }

        System.out.println("Month " + monthabrev + " has " + day + " days");
    }
}
