package classwork.chapter8.Figures;

public class FindAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(10,10); its abstarct!
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10, 8);
        Figure figref;//its ok as its only link not object


        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("area is " + figref.area());
    }
}
