package comparison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        Set<Animal> set =new TreeSet<>();

        addAnimal(list);
        addAnimal(set);

        System.out.println(list);
        System.out.println(set);

    }
    public static void addAnimal(Collection collection){
        collection.add(new Animal(1,"Horse"));
        collection.add(new Animal(2,"Frog"));
        collection.add(new Animal(5,"Dog"));
        collection.add(new Animal(4,"Monkey"));
        collection.add(new Animal(3,"Bee"));
    }
}

class Animal implements Comparable<Animal>{
    int id;
    String kind;

    public Animal(int id, String kind) {
        this.id = id;
        this.kind = kind;
    }

    public int getId() {
        return id;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && kind == animal.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kind);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", kind=" + kind +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        if (this.kind.length()>o.getKind().length()){
            return 1;
        }else if (this.kind.length()<o.getKind().length()){
            return -1;
        }else {
            return 0;
        }
    }
}