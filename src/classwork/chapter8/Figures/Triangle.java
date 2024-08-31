package classwork.chapter8.Figures;

public class Triangle extends Figure{
    Triangle (double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("area for triangle");
        return dim1*dim2/2;
    }
}
