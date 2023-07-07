package algorithms;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

//Programming Problem: Small Fibonacci Number
public class FibonacciNumbers {
    Map<Integer, BigInteger> map=new HashMap<>();
    int cnt;

    private BigInteger fibonacci(int n){
        cnt++;
        if (n<2){
            return BigInteger.valueOf(n);
        }
        if(map.containsKey(n)){
            return map.get(n);
        }else {
            for (int i = 2; i <=n ; i++) {
                BigInteger res= fibonacci(i-1).add(fibonacci(i-2));
                map.put(i,res);
            }

            return map.get(n);
        }
    }



    public void run(int n){
        System.out.println(n+" : "+fibonacci(n) );
        System.out.println(cnt+" calls");

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new FibonacciNumbers().run(100000);
        long finish = System.currentTimeMillis();
        System.out.println(finish-start+"ms");

    }
}
