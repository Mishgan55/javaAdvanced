package algorithms;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumbers2 {
    private static final int MOD=(int) (1e9+7);

    List<Integer> list=new ArrayList<>();

    {
        list.add(0);
        list.add(1);
    }

    private Integer fibonacci(int n){
        for (int i = list.size(); i <=n ; i++) {
           int res= (fibonacci(i-1)+fibonacci(i-2))%MOD;
           list.add(res);

        }return list.get(n);

    }

    public void run(int n){
        System.out.println(n+" : "+ fibonacci(n));
    }

    public static void main(String[] args) {

        new FibonacciNumbers2().run(100000);


    }
}
