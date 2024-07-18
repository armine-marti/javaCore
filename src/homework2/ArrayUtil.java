package homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8, 4};

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        System.out.println();

        //2-first element
        System.out.println(numbers[0]);
        System.out.println();

        //3-last element
        System.out.println(numbers[numbers.length - 1]);
        System.out.println();

        //4-array length
        System.out.println(numbers.length);
        System.out.println();

        //5-smallest element
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println();

        //6-middle value
        if (numbers.length <= 2) {
            System.out.println("can't print middle values");
        } else {
            if (numbers.length % 2 == 0) {
                System.out.println("middle values");
                System.out.println(numbers[(numbers.length/2) - 1]);
                System.out.println(numbers[numbers.length/2]);
            } else {
                System.out.println("middle value:");
                System.out.print(numbers[numbers.length/2]);
            }
        }
        System.out.println();
        System.out.println();


        //7- even elements
        int evenCount = 0;
       for(int x = 0; x < numbers.length; x++){
           if(numbers[x] % 2 == 0){
               evenCount++;
           }
       }
        System.out.println(evenCount);
        System.out.println();

       //8 - odd elemnts
        int oddCounts = 0;
        for (int y = 0; y < numbers.length; y++){
            if(numbers[y] % 2 != 0){
                oddCounts++;
            }
        }
        System.out.println(oddCounts);
        System.out.println();
        System.out.println();

        //9-sum of elements
        int sum = 0;
        for(int m = 0; m < numbers.length; m++){
            sum += numbers[m];
        }
        System.out.println(sum);
        System.out.println();

        //10 average numbers;

        System.out.println("average number is " + sum / numbers.length);
    }
}
