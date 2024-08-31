package classwork.chapter8.Bag;

public class DemoSuper {
    public static void main(String[] args) {
        BagWeight bag1 = new BagWeight(10,20,15,34.3);
        BagWeight bag2 = new BagWeight(2,3,4,0.076);
        BagWeight bag3 = new BagWeight();
        BagWeight bagcube = new BagWeight(3,2);
        BagWeight bagclone = new BagWeight(bag1);
        double vol;

        vol = bag1.volume();
        System.out.println("volume of bag1 is: "+ vol);
        System.out.println("weight of bag1 is: " + bag1.weight);
        System.out.println();

        vol = bag2.volume();
        System.out.println("volume of bag2 is: " + vol);
        System.out.println("weight of bag2 is: " + bag2.weight);
        System.out.println();

        vol = bag3.volume();
        System.out.println("volume osg bag3 is: " + vol);
        System.out.println("weight of bag3 is " + bag3.weight);
        System.out.println();

        vol = bagcube.volume();
        System.out.println("Volume of a bagcube is: " + vol);
        System.out.println("weight of a bagcube is: " + bagcube.weight);
        System.out.println();

        vol = bagclone.volume();
        System.out.println("volume of bagclone is: " + vol);
        System.out.println("weight of a bagclone is: " + bagclone.weight);
        System.out.println();

        Shipment shp1 = new Shipment(10,20,15,10,3.41);
        Shipment shp2 = new Shipment(2,3,4,0.076,1.28);


        vol = shp1.volume();
        System.out.println("volume of the shp1 is " + vol);
        System.out.println("weight of shp1 is " + shp1.weight);
        System.out.println("cost of shp1 is " + shp1.cost);
        System.out.println();

        vol = shp2.volume();
        System.out.println("volume of shp2 is" + vol);
        System.out.println("weight of shp2 is" + shp2.weight);
        System.out.println("cost of shp2 is " + shp2.cost);
        System.out.println();
    }
}
