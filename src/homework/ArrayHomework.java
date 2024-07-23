package homework;

public class ArrayHomework {
    public static void main(String[] args) {

        System.out.println("exercise 1");
        //check if there is 6 in the array
        int[] numbers = {11, 23, 7, 68, 2, 15, 51, 32, 51, 20};
        int count = 0;
        for (int i : numbers) {
            if (i == 6) {
                count++;
            }
        }
        if (count <= 0) {
            System.out.println("there is no 6 in the array");
        } else {
            System.out.println("6 appears " + count + " time in the array ");
        }

        System.out.println("\nexercise 2");
        //print array numbers in reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }


        System.out.println();
        System.out.println("\nexercise 3");
        //find out if the array have same numbers
        for (int a = 0; a < numbers.length; a++) {
            int repeat = 0;
            for (int b = a + 1; b < numbers.length; b++) {
                if (numbers[a] == numbers[b]) {
                    repeat++;
                    System.out.println(numbers[a] + " repeats");
                }
            }
        }

        System.out.println();
        System.out.println("\nexercise 4");
        //find out how many vowels there are in array
        char[] chars = {'b', 'a', 'r', 'v', 'a', 'h', 'x', 'a', 'r', 'c'};
        char[] vowels = {'a', 'e', 'i', 'u', 'o'};
        int vowel = 0;
        for (char x : chars) {

            for (char y : vowels) {
                if (x == y) {
                    vowel++;
                }
            }
        }
        System.out.println("there are " + vowel + " vowels in the array");


    }
}
