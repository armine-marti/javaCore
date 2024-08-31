package homework.braceChecker;

public class Stack {
    private Brace [] array = new Brace[10];
    private int tos;

   public Stack(){
        tos = -1;
    }

    void push(Brace item){
        if(tos==9) {
            System.out.println("Stack is full!");
        } else {
            array[++tos] = item;
        }
    }

    Brace pop() {
        if (tos < 0) {
            return null;
        } else {
            return array[tos--];
        }

    }
    public boolean isEmpty(){
       return tos == -1;
    }
}
