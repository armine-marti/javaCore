package classwork.chapter8;

public class B extends A {
    int k;
int total;
char shadow; //this shadow hides the shadow from class A
    B(char s, char t){
        super.shadow = s; //shadow from A
        shadow = t; //shadow from B

    }

B(){
    System.out.println("this is b constuctor");
}
void summ(){
    //total = a +b; //Error!

}
void override(String b){
    System.out.println(b);
}
    void showk(){
        System.out.println("k: " + k);
    }
void callme(){
    System.out.println("inside B call method");
}
    void sum(){
        System.out.println("i + j +k: " + (i+j+k));
    }

    void show(){
        System.out.println("shadow in superclass is: " + super.shadow);
        System.out.println("shadow in subclass is: " + shadow);
    }
}
