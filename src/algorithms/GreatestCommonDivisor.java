package algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int b = scanner.nextInt();
        divisor(i,b);






        }
        public static  int divisor(int i, int b){
            if(i==0){
                System.out.println(b);
                return b;
            }else if(b==0){
                System.out.println(i);
                return i;

            }else
            if(i>=b){
           i=i % b;



        }else if(b>=i){
                b=b%i;




}return divisor(i,b);
}
}

