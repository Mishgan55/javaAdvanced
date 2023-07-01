package algorithms;

import java.util.Scanner;

public class fibonacciNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        int[] numbers = new int[index];
        numbers[0] = 1;
        numbers[1] = 1;
        if (index == 0 || index == 1) {
            System.out.println(index);
            return;
        } else {
            for (int i = 2; i < numbers.length; i++) {

                numbers[i] = (numbers[i - 1] + numbers[i - 2])%10;
            }



        }
        System.out.println(numbers[index-1]);



    }

}
