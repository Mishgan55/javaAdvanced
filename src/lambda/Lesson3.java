package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr=new int[10];

        listAdd(list);
        arrAdd(arr);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        System.out.println("///////////////////////MAP///////////////////////////");
        List<Integer> collect = list.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(collect);
        int[] ints = Arrays.stream(arr).map(a -> a * 10).toArray();
        System.out.println(Arrays.toString(ints));
        System.out.println("///////////////////////FILTER///////////////////////////");

        List<Integer> collect1 = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(collect1);

        int[] ints1 = Arrays.stream(arr).filter(a -> a % 2 != 0).toArray();
        System.out.println(Arrays.toString(ints1));

        System.out.println("///////////////////////REDUCE///////////////////////////");

        Integer integer = list.stream().reduce((sum, a) -> sum += a).get();
        System.out.println(integer);

        int asInt = Arrays.stream(arr).reduce((sum, a) -> sum = sum * a).getAsInt();
        System.out.println(asInt);


    }
    private static void listAdd(List<Integer> list){
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
    }
    private static void arrAdd(int[] arr){
        for (int i = 0; i < 10; i++) {
            arr[i]=i+1;
        }
    }


}
