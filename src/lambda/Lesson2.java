package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson2 {
    public static void main(String[] args) {

        int[] arr=new int[10];
        List<Integer> list=new ArrayList<>();

        addArr(arr);
        addList(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
// map method
        arr=Arrays.stream(arr).map(a->a+1).toArray();
        list=list.stream().map(a->a*2).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
// filter method
        int[] arr1=new int[10];
        List<Integer> list1= new ArrayList<>();

        addArr(arr1);
        addList(list1);

        arr1=Arrays.stream(arr1).filter(a->a%2==0).toArray();
        list1=list1.stream().filter(a->a%2!=0).collect(Collectors.toList());
// forEach
        Arrays.stream(arr1).forEach(a-> System.out.print(a+" "));
        System.out.println();
        list1.stream().forEach(a-> System.out.print(a+" "));
        System.out.println();
//reduce
        int[] arr2=new int[10];
        List<Integer> list2= new ArrayList<>();

        addArr(arr2);
        addList(list2);

        int sum=Arrays.stream(arr2).reduce(0,(acc,b)->b=acc+b);
        int product=list2.stream().reduce((acc,b)->b=acc*b).get();
        System.out.println(sum);
        System.out.println(product);
//filter+map
        int[] arr3=new int[10];
        List<Integer> list3= new ArrayList<>();

        addArr(arr3);
        addList(list3);

        arr3=Arrays.stream(arr3).filter(a->a%2!=0).map(a->a*2).toArray();
        list3=list3.stream().filter(a->a%2==0).map(a->a*4).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr3));
        System.out.println(list3);

    }

    private static void addArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i]=i+1;

        }

    }

    private static void addList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i+1);

        }

    }
}
