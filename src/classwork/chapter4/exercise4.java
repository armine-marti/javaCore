package classwork.chapter4;

public class exercise4 {
    public static void main(String[] args) {
        int [] numbers = {3, 55, 43, 1, 8, 9, 6, 33};
        int max = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if (numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }


}
