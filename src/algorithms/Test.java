package algorithms;

public class Test {

    public static void main(String[] args) {

        fibonacciGet(10);

    }

    private static void fibonacciGet(int number){

        Long[] numbers=new Long[number+1];

        if(number<=1){
            System.out.println(number);
        }
        for (int i = 2; i <=number ; i++) {
            numbers[0]= Long.valueOf(0);
            numbers[1]= Long.valueOf(1);
            numbers[i]=numbers[i-2]+numbers[i-1];


        }
        System.out.println(numbers[number]);
    }
}
