package algorithms;

import java.math.BigInteger;


public class GreatestCommonDivisor {
    public static void main(String[] args) {
new GreatestCommonDivisor().run();




    }

    public void run(){
        System.out.println(divisor(new BigInteger("12312341252345"),new BigInteger("323124423455332")));
    }

    private BigInteger divisor(BigInteger i, BigInteger b) {
        while (true) {
            System.out.println(i + " " + b);
            if (i.equals(BigInteger.ZERO)) {
                return b;
            }
            if (b.equals(BigInteger.ZERO)) {
                return i;
            }
            if (i.compareTo(b) >= 0) {
                i = i.mod(b);


            } else {
                b = b.mod(i);

            }


        }
    }
}

