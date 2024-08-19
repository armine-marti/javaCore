package classwork.chapter5;

public class ForTick {
    public static void main(String[] args) {
        int n;

        for(n=10; n>0; n--)
            System.out.println("tick " +n);

        System.out.println();
        System.out.println();

        //here k is declared inside of the for loop
        for(int k=10; k>0; k--)
            System.out.println("tick " +n);
    }
}
