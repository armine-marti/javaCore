package classwork.chapter8.Box;

public class DemoBinWeight {
    public static void main(String[] args) {
        BinWeight mybin1 = new BinWeight(10, 20, 15, 34.3);
        BinWeight mybin2 = new BinWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybin1.volume();
        System.out.println("volume of bin1 is: " + vol);
        System.out.println("weight of bin1 is: " +mybin1.weight);
        System.out.println();

        vol = mybin2.volume();
        System.out.println("volume of mybin2 is : " + vol);
        System.out.println("weight of mybin2 is: " + mybin2.weight);

        BinWeight binw1 = new BinWeight(3, 5, 7, 8.37);
        Bin plainbin = new Bin();

        vol = binw1.volume();
        System.out.println("Volume of binw1 is: " + vol);
        System.out.println("Weight of binw1 is " + binw1.weight);
        System.out.println();

        //assign Boxweight refernce to bin reference

        plainbin = binw1;

        vol = plainbin.volume();
        System.out.println("volume of plainbin is " + vol);

        //the folowing statement doesnt work as plainbin isnot
        // a memebr of weight parametr

        //system.out.println("weight of plainbin is" + plainbin.weight);
    }
}
