package homework.onlineShop.test;

public interface OnlineShopAdminInt {

    String LOGOUT = "0";
    String ADD_PRODUCT = "1";
    String REMOVE_PRODUCT_BY_ID = "2";
    String PRINT_PRODUCTS = "3";
    String PRINT_USERS = "4";
    String PRINT_ORDERS = "5";
    String CHANGE_ORDER_STATUS = "6";

    static void printAdminCommands(){
        System.out.println("Please press " + LOGOUT + " for LOGOUT");
        System.out.println("Please press " + ADD_PRODUCT + " for ADD PRODUCT");
        System.out.println("Please press " + REMOVE_PRODUCT_BY_ID + " for REMOVE PRODUCT BY ID");
        System.out.println("Please press " + PRINT_PRODUCTS + " for PRINT PRODUCTS");
        System.out.println("Please press " + PRINT_USERS + " for PRINT USERS");
        System.out.println("Please press " + PRINT_ORDERS + " for PRINT ORDERS");
        System.out.println("Please press " + CHANGE_ORDER_STATUS + " for CHANGE ORDER STATUS");
    }
}
