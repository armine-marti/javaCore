package classwork.chapter8.Box;

public class Bin {
    double width;
    double height;
    double depth;

    //create clone of a object
    Bin(Bin obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //constructor used when all dimension are set
    Bin(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //constructor when no dimensons are known
    Bin(){
        width = -1;
        height = -1;
        depth = -1;
    }
    //cube bin
    Bin(double len){
        width = height = depth;
    }

    //compute and return volume
    double volume(){
        return width*height*depth;
    }
}
