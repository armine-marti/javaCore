package Questions;

public class patterns {
    public static void main(String[] args) {

        int i,j;
        int lenght=5;
        for (i=5; i<=lenght; i--){
            for(j=5; j>=i; j--){
                System.out.print("* ");
            }
            for (j=0; j>=2*(lenght-i); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
