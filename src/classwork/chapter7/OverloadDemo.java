package classwork.chapter7;

public class OverloadDemo {
    void test(){
        System.out.println("no parameters");
    }
    //overload method with one integer parameter
    void test(int a){
        System.out.println("a: " + a);
    }
    //overload with 2 int parameter
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    //overload test with double parameter
    double test(double a){
        System.out.println("double a: " + a);
        return a*a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("result of ob.test(123.25): " + result);
    }
}