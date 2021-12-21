package ch_01;


public class Order {



    public static final String NEWLINE = System.getProperty("line.separator");


    public int orderId;
    public String buyerId;
    public String staffId;
    public int productId;
    public String orderDay;

    public void showReceipt() {
        System.out.println( System.lineSeparator() + buyerId + "'s order : product No." + productId + System.lineSeparator() + "OrderId : " + orderId + System.lineSeparator() + "- - - - - - - - - - - - - " + System.lineSeparator() + "Day : " + orderDay + System.lineSeparator() + "- - - - - - - - - - - - - " + System.lineSeparator() + "Helper Staff : " + staffId + System.lineSeparator() + "--------------------------------" + System.lineSeparator());
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String email) {
        buyerId = email;
    }
}
