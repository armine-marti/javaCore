package classwork.chapter6_2;

public class BoxDemo6 {
    public static void main(String[] args) {
        //declare allocate initialize Box objects
        Boxx mybox1 = new Boxx(15,2,6);
        Boxx mybox2 = new Boxx(11,16,18);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("volume is " +vol);

    }
}
