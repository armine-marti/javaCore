package classwork.chapter8.Figures;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("area for figure is underfined ");
        return 0;
    }
}
