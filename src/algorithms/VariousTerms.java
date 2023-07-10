package algorithms;

import java.util.ArrayList;

import java.util.Scanner;
/*По данному числу 1≤n≤10 найдите максимальное число
k, для которого
n можно представить как сумму
k различных натуральных слагаемых. Выведите в первой строке число
k, во второй — k слагаемых.*/

public class VariousTerms {

    public static void main(String[] args) {
        new VariousTerms().run();

    }
    public void run(){

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

int result=x;
int count=0;

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= x; i++) {


            if ( result-i>=i+1){

                result=result-i;
                integers.add(i);
            }else {
                integers.add(result);

                break;
            }

        }
        for (Integer integer : integers) {
            count++;

        }
        System.out.println(count);
        for (Integer integer : integers) {
            System.out.print(integer+" ");

        }




















    }
}
// 5     1 2 3 4 5

//6     1 2 3 4 5 6

// 6-1=5>2   1    5-2=3>3   2     3

//7     7-1=6    1    6-2=4   2   4-3    4
//      x-i[j]<i[j+1]