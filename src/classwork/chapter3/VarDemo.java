package classwork.chapter3;

public class VarDemo {
    public static void main(String[] args) {
        //use type inference to determine the type of the
        //variable named avg. int his case double is inferred
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);
        //in the following context var is not predefined identifier
        // its simply a user defined variable name
        int var = 1;
        System.out.println("Value of var: " + var);
        //var is used as both the type  of the declaration and as a variable name in the initializer
        var k = -var;
        System.out.println("Value of k:" + k);
    }
}
