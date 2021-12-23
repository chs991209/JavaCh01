package ch_01;

public class OrderTest {
    public static void main(String[] args) {

        Order orderMon = new Order();

        orderMon.buyerId = "Btw";
        orderMon.orderDay = "Monday";
        orderMon.staffId = "Monster";
        orderMon.productId = 1;

        orderMon.orderId = 1;

//        Log
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.println( orderMon.orderDay + " Receipt");
//        BLANK
        System.out.println("");

        orderMon.showReceipt();
//        BLANK
        System.out.println("");



        Order orderTue = new Order();

        orderTue.buyerId = "Anw";
        orderTue.orderDay = "Tuesday";
        orderTue.staffId = "Tune";
        orderTue.productId = 2;
        orderTue.orderId = 2;
//        Log : Basic Format

        System.out.println( orderTue.orderDay + " Receipt");
//        BLANK
        System.out.println("");

        orderTue.showReceipt();
//        BLANK
        System.out.println("");
    }
}
