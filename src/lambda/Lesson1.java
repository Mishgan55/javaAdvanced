package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("Misha");
        list.add("Ksenia");
        list.add("Max");
        list.add("Mx");
        list.add("X");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length()>o2.length())
//                return 1;
//                else if(o1.length()<o2.length())
//                    return -1;
//                else
//                    return 0;
//            }
//        });

        list.sort((o1, o2) ->{
                if(o1.length()>o2.length())
                return 1;
                else if(o1.length()<o2.length())
                    return -1;
                else
                    return 0;
            } );
        System.out.println(list);
    }
}
