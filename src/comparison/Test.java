package comparison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person(1,"Misha"));
        arrayList.add(new Person(3,"Ksenia"));
        arrayList.add(new Person(2,"Anna"));

        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId()>o2.getId()){
                    return 1;
                }else if (o1.getId()<o2.getId()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(arrayList);

    }


}
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
