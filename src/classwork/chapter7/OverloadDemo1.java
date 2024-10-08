package classwork.chapter7;

public class OverloadDemo1 {
    void test (){
        System.out.println("no parameters");
    }
    //overload test for two integer parameters
    void test(int a, int b){
        System.out.println("a and b: " +a + " " + b);
    }
    void test(double a){
        System.out.println("inside test (double) a: " + a);
    }
}

class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;

        ob.test();
        ob.test(10,20);
        ob.test(i); //this will invoke test double
        ob.test(123.2); //this will invoke test double

    }
}