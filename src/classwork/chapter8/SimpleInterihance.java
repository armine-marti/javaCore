package classwork.chapter8;

public class SimpleInterihance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //the superclass can be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        //subclass has acces to all publics members of superclass

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i , j and k in subOb: ");
        subOb.sum();

        B subOb1 = new B();

        subOb1.setab(10,12);

        System.out.println("Total is ");

        B shadowobject  = new B('@', '-');
        shadowobject.show();

       C order = new C();

       B overr = new B();
       overr.override("Hello");

       A a1 = new A();
       B b1 = new B();
       C c1 = new C();

       A r;
       r = a1;
       r.callme();

       r = b1;
       r.callme();

       r = c1;
       r.callme();
    }
}
