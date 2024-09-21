package homework.onlineShop.test;

public interface OnlineShopUserInt  {

    String LOG_OUT = "0";
    String PRINT_ALL_PRODUCTS = "1";
    String BUY_PRODUCTS = "2";
    String PRINT_MY_ORDERS = "3";
    String CANCEL_ORDER = "4";


    static void printUserCommands(){
        System.out.println("Please press " + LOG_OUT + " for LOGOUT");
        System.out.println("Please press " + PRINT_ALL_PRODUCTS + " for PRINT ALL PRODUCTS");
        System.out.println("Please press " + BUY_PRODUCTS + " for BUY PRODUCT");
        System.out.println("Please press " + PRINT_MY_ORDERS + " for PRINT MY ORDERS");
        System.out.println("Please press " + CANCEL_ORDER + " for CANCEL ORDER");

    }
}
