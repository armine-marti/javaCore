package classwork.chapter8.Bag;

public class BagWeight extends Bag {
    double weight;

    //contructor for clone object
    BagWeight(BagWeight obj) {
        super(obj);
        weight = obj.weight;
    }

    BagWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }

    BagWeight(){
        super();
        weight = -1;
    }

    BagWeight(double len, double m){
        super(len);
        weight = m;
    }

}
