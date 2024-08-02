package homework;

public class Sort {
    public static void main(String[] args) {

        int[] numbers = {4, 7, 1, 3, 9, 0, 2};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int min = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = min;
                }
            }
        }
        for (int x : numbers) {
            System.out.print(x + ", ");
        }
    }

}
