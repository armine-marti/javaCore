package classwork.chapter5;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("tick " + n);
            n--;
        } while (n > 0);
        //OR do{
        // System.out.println("tick" +n);
        // } while (--n > 0);
    }
}
