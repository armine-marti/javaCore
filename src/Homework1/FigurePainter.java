package Homework1;

public class FigurePainter {
    public static void main(String[] args) {
        int x,y;
        int rows = 5;
        for (x=0;x<rows;x++){
            for (y=0;y<=x; y++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();


        int m,n;
        int lines = 5;
        for(m=0; m<lines; m++){
            for(n=5; n>m; n--){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        int k,l;
        int size = 5;
        for (k=0; k<size; k++){
            for(l=2*(size-k); l>=0;l--){
                System.out.print(" ");
            }
            for(l=0; l<=k; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        int i,j;
        int lenght=5;
        for (i=5; i>=0; i--){
            for(j=5; j>=i; j--){
                System.out.print(" ");
            }
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        int a, b;
        int half=5;
        for (a=0; a<half; a++) {
            for (b = 0; b<half-a-1; b++) {
                System.out.print(" ");
            }
            for (b = 0; b<2*a+1;b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (a = half - 2; a >= 0; a--) {
            for (b = 0; b < half - a - 1; b++) {
                System.out.print(" ");
            }
            for (b = 0; b < 2 * a + 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
