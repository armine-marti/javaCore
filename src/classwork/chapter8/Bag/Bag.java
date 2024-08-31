package classwork.chapter8.Bag;

public class Bag {
    private double width;
    private double height;
    private double depth;

    //constructor clone of object
    Bag(Bag obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    Bag(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Bag(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Bag(double len){
        width = height = depth = len;
    }

    double volume(){
        return width*height*depth;
    }
}
