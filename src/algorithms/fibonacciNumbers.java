package algorithms;

import java.util.Scanner;
//Programming Problem: Small Fibonacci Number
public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        int[] numbers=new int[40];
        numbers[0]=1;
        numbers[1]=1;
        for (int i = 2; i < numbers.length; i++) {

            numbers[i]=numbers[i-1]+numbers[i-2];


        }
        for (int number : numbers) {
            System.out.println(number);

        }
        System.out.println(numbers[index-1]);








    }
}
