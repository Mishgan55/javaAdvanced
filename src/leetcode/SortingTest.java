package leetcode;

import java.util.Arrays;

//17,18,5,4,6,1
public class SortingTest {
    public static void main(String[] args) {

    int[] arr=new int[]{17,18,5,4,6,1};

    boolean mark=false;

    while(!mark){
        mark=true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                mark=false;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
        System.out.println(Arrays.toString(arr));
    }
}
