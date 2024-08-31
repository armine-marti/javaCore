package classwork.chapter8.Figures;

public class Rectangle extends Figure{
    Rectangle (double a, double b){
        super (a,b);
    }

    //override area()
    double area(){
        System.out.println("area for rectangle.");
        return dim1*dim2;
    }
}
