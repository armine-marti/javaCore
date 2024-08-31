package classwork.chapter8;

public class A {

    A(){
        System.out.println("this is A's constuctor");
    }
    int i, j;
    int shadow;
    int a;
    private int b;

    void setab(int x, int y){
        a = x;
        b = y;
    }

    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }

    void override(String a){
        System.out.println(a);

    }
   void callme(){
       System.out.println("inside A call method");
   }

}
