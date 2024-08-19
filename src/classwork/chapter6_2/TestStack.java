package classwork.chapter6_2;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //push some numbers onto the break
        for(int i = 0; i<10;i++) mystack1.push(i);
        for(int i = 10; i <20; i++) mystack2.push(i);

        //pop those numbers off the stack
        System.out.println("stack in mystack1: ");
        for(int i = 0;i<10;i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack inmystack2: ");
        for (int i = 0; i<10; i++)
            System.out.println(mystack2.pop());
    }
}