package homework.braceChecker;

public class Brace {
    public char brace;
    public int index;

    public Brace() {
    }
    public Brace (char brace){
        this.brace = brace;
    }
    public Brace(int index){
        this.index = index;
    }
    public String toString() {
        return Character.toString(brace);
    }
}