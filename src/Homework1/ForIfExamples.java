package Homework1;

public class ForIfExamples {
    public static void main(String[] args) {

        int x;
        for (x = 1; x <= 10; x = x + 1){
            System.out.println("This is x: " + x);
        }

        int sum = 0;
        for (x = 1; x <=100; x++){
            sum = sum + x;
        }
        System.out.println("\nThe sum is:" + sum + "\n");

       int n;
       for (n = 50; n>=1; n--){
           System.out.println("This is n: " + n);
       }
       System.out.print("\n");

       int k;
       for (k = 1; k<20; k += 2) {
           System.out.println("This is k: " + k);
       }

       int m;
       byte qanak = 0;
       for (m = 0; m<100; m +=2){
           qanak++;
       }
       System.out.println("\nThe number of even numbers is " + qanak);
    }
}
