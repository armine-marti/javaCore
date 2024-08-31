package classwork.chapter8.inference;

import org.w3c.dom.ls.LSOutput;

public class TestInference {

    static MyClass getObj(int which){
        switch(which){
            case 0: return new MyClass();
            case 1:return new Firstderived();
            default:return new Secondderived();
        }
    }

    public static void main(String[] args) {
        var mc = getObj(0);
        var mc1 = getObj(1);
        var mc2 = getObj(2);

       // mc2.x = 10;//My class doesnt have x
    }

}
