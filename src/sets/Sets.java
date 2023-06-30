package sets;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<Integer> hashSet1= new HashSet<>();
        Set<Integer> hashSet2= new HashSet<>();
        addSet(hashSet1,15);
        addSet(hashSet2,35);

        //union
        Set<Integer> union=new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);

        //intersection
        Set<Integer> intersection=new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);
        System.out.println(intersection);

        //difference
        Set<Integer> difference=new HashSet<>(hashSet1);
        difference.removeAll(hashSet2);
        System.out.println(difference);


    }
    public static void addSet(Set<Integer> set,int value){
        for (int i = 0; i < value; i++) {
            set.add(i);

        }

    }
}
