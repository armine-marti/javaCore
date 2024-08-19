package classwork.chapter7;

public class Box {
    double width;
    double height;
    double depth;

    //constructor with all dimensions specified
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    //constructor when no dimensions specified
    Box () {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }
    //compute and return volume
    double volume(){
        return width * height * depth;
    }
}

class OverloadCons{
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        //volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("Volume of mycube " +vol);
    }
}