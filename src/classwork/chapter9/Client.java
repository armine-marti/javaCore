package classwork.chapter9;

public class Client implements Callback {
    public void callback(int p){
        System.out.println("calback called with " + p);
    }

    void nonIfaceMeth(){
        System.out.println("classes that implement interfaces " + "may also define other members too");
    }
}
