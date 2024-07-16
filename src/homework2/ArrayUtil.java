package homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int i;
        for (i=0;i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        System.out.println();

        //2-first element
        System.out.println(numbers[0]);
        System.out.println();

        //3-last element
        int lastElement = numbers.length - 1;
        System.out.println(lastElement);
        System.out.println();

        //4-array length
        System.out.println(numbers.length);
        System.out.println();

        //5-smallest element
        int min = numbers[0];
        for (i=0; i<numbers.length; i++){
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println();

        //6-middle value
       int length = numbers.length;
       int middleIndex = length/2;
       int middleValue = numbers[middleIndex];
        System.out.println(middleValue);
        if (middleIndex<=2){
            System.out.println("can't print middle values");
        }
        System.out.println();

        //7- even elements
        int count = 0;
       for(int x = 0; x < numbers.length; x++){
           if(numbers[x]%2==0){
               count++;
           }
       }
        System.out.println(count);
        System.out.println();

       //8 - odd elemnts
        int counts = 0;
        for (int y = 0; y<numbers.length;y++){
            if(numbers[y]%2 != 0){
                counts++;
            }
        }
        System.out.print(counts);
        System.out.println();
        System.out.println();

        //9-sum of elements
        int sum=0;
        int m;
        for(m=0; m<numbers.length;m++){
            sum = sum + numbers[m];

        }
        System.out.println(sum);
        System.out.println();

        //10 average numbers;
        double averageNumber;
        int k;
        int total=0;
        for(k=0;k<numbers.length;k++){
            total = total + numbers[k];
        }
        averageNumber=total/numbers.length;
        System.out.println(averageNumber);
    }
}
