package algorithms;


import java.util.Arrays;


public class Fibonacci3 {
    public static void main(String[] args) {
        int size=55;
        long[] arr=new long[size+1];
        Arrays.fill(arr,-1);
        System.out.println(getFibonacci(size,arr));
    }

    private static long getFibonacci(int i, long[] arr) {

        if (arr[i]!=-1) {
            return arr[i];
        }
        if (i<=1){
            return i;
        }
        long result=getFibonacci(i-1,arr)+getFibonacci(i-2,arr);
        arr[i]=result;
        return result;
    }
}
