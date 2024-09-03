package classwork.chapter9.IntStack;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for (int i = 0; i<5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i<8; i++) {
            mystack2.push(i);
        }

        System.out.println("Satck in mystack1: " );
        for (int i = 0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("stack in mystack2: ");
        for (int i = 0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}
