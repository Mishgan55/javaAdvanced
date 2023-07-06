package sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list= new LinkedList<>();
        for (int i = 0; i < 55; i++) {
            list.add(i);

        }

        Iterator<Integer> iterator= list.iterator();
        int idx=0;

        while (iterator.hasNext()){
            iterator.next();
            if(idx<=20){
                iterator.remove();}


            idx++;


        }
        System.out.println(list);

    }

}
