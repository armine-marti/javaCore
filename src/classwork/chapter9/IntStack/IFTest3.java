package classwork.chapter9.IntStack;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack dstack = new DynStack(5);
        FixedStack fstack = new FixedStack(8);

        mystack = dstack;
        for (int i=0;i<12;i++)
            mystack.push(i);

        mystack = fstack;
        for(int i = 0; i<8;i++)
            mystack.push(i);

        mystack = dstack;
        System.out.println("Values in dynamic stack");
        for(int i = 0; i<12;i++)
            System.out.println(mystack.pop());

        mystack = fstack;
        System.out.println("Values in fixed stack");
        for(int i= 0; i<8;i++)
            System.out.println(mystack.pop());
    }
}
