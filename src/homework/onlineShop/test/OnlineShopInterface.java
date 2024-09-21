package homework.onlineShop.test;

public interface OnlineShopInterface {
    String LOGIN = "0";
    String REGISTER = "1";

    static void printCommands(){
        System.out.println("Please input " + LOGIN + " for LOGIN");
        System.out.println("Please input " + REGISTER + " for REGISTER");
    }
}
