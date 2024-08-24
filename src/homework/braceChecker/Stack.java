package homework.braceChecker;

public class Stack {
    public Brace[] braces = new Brace[10];
    private int size;

    Stack(){
        size = -1;
    }

    void push(char brace){
        if(size==9)
            System.out.println("Stack is full");
        else
            braces[++size] = new Brace(brace);
    }

    int pop() {
        if (size < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return braces[size--].brace;
    }
}
