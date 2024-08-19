package classwork.chapter7;

public class Test4 {
    int a; //default access
    public int b;
    private int c;

    //methods to access C
    void setc(int i) { //set c's value
        c = i;
    }
    int getc(){ //get c's calues'
        return c;
    }
}
class AccessTest{
    public static void main(String[] args) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

        //this is not ok and will the error
        //ob.c = 100;

        //you have to access it through the method
        ob.setc(100);
        System.out.println("a,b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}