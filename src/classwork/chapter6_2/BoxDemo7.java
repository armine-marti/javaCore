package classwork.chapter6_2;

public class BoxDemo7 {
    public static void main(String[] args) {
        Boxx mybox1 = new Boxx(10, 20,15);
        Boxx mybox2 = new Boxx(3,6,9);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " +vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);


    }
}
