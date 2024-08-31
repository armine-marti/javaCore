package classwork.chapter8.Bag;

public class Shipment extends BagWeight{
    double cost;

    // create a clone
    Shipment (Shipment obj){
        super(obj);
        cost = obj.cost;
    }

    Shipment(double w, double h, double d, double m , double c ){
        super(w,h,d,m);
        cost = c;
    }

    Shipment(){
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c){
        super (len, m);
        cost = c;
    }

}
