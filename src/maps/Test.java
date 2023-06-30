package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Person> set=new HashSet<>();
        Map<Person,String> map=new HashMap<>();

        Person misha = new Person(1, "Misha");
        Person anna = new Person(1, "Misha");

        set.add(misha);
        set.add(anna);
        System.out.println(set);

        map.put(misha,"5598");
        map.put(anna,"2580");
        System.out.println(map);


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

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

