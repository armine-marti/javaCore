package classwork.chapter7;

public class Stack1 {
    private int[] stck;
    private int tos;

    //allocate and initialize stack
    Stack1(int size){
        stck = new int[size];
        tos = -1;
    }

    void push(int item){
        if(tos==stck.length-1)
            System.out.println("stack is full");
        else
            stck[++tos] = item;
    }
    int pop(){
        if(tos<0){
            System.out.println("stack underflow");
            return 0;
        } else
            return stck[tos--];
    }
}
class TestStack2{
    public static void main(String[] args) {
        Stack1 mystack1 = new Stack1(5);
        Stack1 mystack2 = new Stack1(8);

        //push numbers onto the stack
        for (int i = 0; i<5;i++)mystack1.push(i);
        for (int i = 0;i<8;i++)mystack2.push(i);

        System.out.println("stack in mystack1");
        for (int i = 0;i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("stack in mystack2");
        for(int i = 0; i<8;i++)
        System.out.println(mystack2.pop());
    }
}