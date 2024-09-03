package classwork.chapter9.NestedOne;

public class NestedIntDemo {
    public static void main(String[] args) {

        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("10 isnot negative");
        if (nif.isNotNegative(-12))
            System.out.println("this wont be displayed");
    }
}
