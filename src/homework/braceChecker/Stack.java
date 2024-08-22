package homework.braceChecker;

public class Stack {
    private int[] brace = new int[10];
    private int size;

    Stack(){
        size = -1;
    }

    void push(int item){
        if(size==9)
            System.out.println("Stack is full");
        else
            brace[++size] = item;
    }

    int pop() {
        if (size < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return brace[size--];
    }
}
