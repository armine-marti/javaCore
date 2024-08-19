package classwork.chapter6_2;

public class Boxx {
    double width;
    double height;
    double depth;

    //this is constructor for class Box
    Boxx (double w, double h, double d) {

        width = w;
        height = h;
        depth = d;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}
