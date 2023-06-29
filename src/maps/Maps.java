package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        Map<Integer,String> linkedHashMap= new LinkedHashMap<>();
        Map<Integer,String> treeMap= new TreeMap<>();

        System.out.println("HashMap///////////////////////////////////////////");
        testMap(hashMap);
        System.out.println("LinkedHashMap///////////////////////////////////////////");
        testMap(linkedHashMap);
        System.out.println("treeMap///////////////////////////////////////////");
        testMap(treeMap);

    }
    public static void testMap(Map<Integer,String> map) {
        map.put(25,"Misha");
        map.put(33,"Anna");
        map.put(2,"Ksenia");
        map.put(55,"Tom");
        map.put(11,"Bob");
        map.put(23,"Tim");
        map.put(545,"Misha");
        map.put(12222,"Misha");

        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        };


    }
}
