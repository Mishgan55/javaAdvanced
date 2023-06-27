package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedComparison{

    public static void main(String[] args) {
        System.out.println("arrayList");
        List<Integer> arrayList= new ArrayList<>();
        measureTimeAdd(arrayList);
        measureTimeGet(arrayList);
        System.out.println("//////////////////////////////");
        System.out.println("linkedList");
        List<Integer> linkedList= new LinkedList<>();
        measureTimeAdd(linkedList);
        measureTimeGet(linkedList);
    }




    public  static void measureTimeGet(List<Integer> list) {
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.get(i);

        }



        long end=System.currentTimeMillis();

        System.out.println("time for get= "+(end-start));

    }




    public static void measureTimeAdd(List<Integer> list) {
        long start=System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long end=System.currentTimeMillis();

        System.out.println("time for add= "+(end-start));

    }
}
