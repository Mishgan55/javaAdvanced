package algorithms;

import java.util.Scanner;
//Задача на программирование: сортировка подсчётом
public class SortingByCounting {
    public static void main(String[] args) {
        new SortingByCounting().run();

    }

    public void run(){


        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] list=new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            list[i]=scanner.nextInt();
        }

        scanner.close();
        final int MAX_VALUE = 10;
        int[] count=new int[MAX_VALUE];

        for (int i = 0; i < list.length; i++) {
            count[list[i]]+=1;
        }
        
        int arrayIndex=0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {

                list[arrayIndex]=i;
                arrayIndex++;
            }
        }
        for (int j : list) {
            System.out.print(j + " ");
        }

    }
}
