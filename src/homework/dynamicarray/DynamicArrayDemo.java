package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray arrayOne = new DynamicArray();

        //checking if array extends automatically when we add more than 10 elements
        arrayOne.add(3);
        arrayOne.add(13);
        arrayOne.add(89);
        arrayOne.add(27);
        arrayOne.add(7);
        arrayOne.add(54);
        arrayOne.add(38);
        arrayOne.add(51);
        arrayOne.add(66);
        arrayOne.add(72);
        arrayOne.add(62);
        arrayOne.add(2);
        arrayOne.add(37);

        //trying method getByIndex
        arrayOne.getByIndex(11);
        System.out.println("Element n12 is " + arrayOne.getByIndex(11));
        System.out.println();

        //trying method print
        arrayOne.print();

        //trying getbyIndex which is more than array.length
        arrayOne.getByIndex(40);
        System.out.println(arrayOne.getByIndex(40));
    }
}
