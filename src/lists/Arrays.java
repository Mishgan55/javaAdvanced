package lists;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add("hello ArrayList "+ i);

        }
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println(arrayList.size());
        System.out.println(arrayList);

    }
}
