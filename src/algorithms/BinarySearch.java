package algorithms;

import java.util.Scanner;

//5 1 5 8 12 13
//5 8 1 23 1 11

public class BinarySearch {
    public static void main(String[] args) {
        new BinarySearch().run();

    }

    public void run(){


        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] list=new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            list[i]=scanner.nextInt();
        }
        int arrValue=scanner.nextInt();
        int[] list1=new int[arrValue];
        for (int i = 0; i < arrValue; i++) {
            list1[i]=scanner.nextInt();
        }
        scanner.close();



        for (int i = 0; i < list1.length; i++) {
            int search = search(list, list1[i]);
            System.out.print(search+" ");
        }
    }

    private int search(int[] list,int number){
        int l=0;
        int r=list.length-1;
        while (l<=r){
            int m = l+((r-l)/2);
            if (list[m]==number){
                return (m+1);
            }else if(list[m]>number){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return -1;
    }


}
