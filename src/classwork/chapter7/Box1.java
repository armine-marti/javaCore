package classwork.chapter7;

public class Box1 {
    double width;
    double height;
    double depth;

    //construcot takes an object of type Box
    Box1(Box1 ob){//pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1 (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box1(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box1(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}

class OverloadCons2{
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10,20,15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        Box1 myclone = new Box1(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("volume of mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("volume of cube is " + vol);

        vol = myclone.volume();
        System.out.println("Volume of clone is " +vol);

    }
}