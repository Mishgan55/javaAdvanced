package algorithms;


import java.util.Arrays;
import java.util.Scanner;

/*Первая строка содержит количество предметов 1≤n≤10 и вместимость рюкзака 0≤W≤2⋅10 . Каждая из следующих
n строк задаёт стоимость 0≤W≤2⋅10 и объём 0<W≤2⋅10 предмета.
Выведите максимальную стоимость частей предметов (от каждого предмета можно отделить любую часть,
стоимость и объём при этом пропорционально уменьшатся),
 помещающихся в данный рюкзак, с точностью не менее трёх знаков после запятой.*/

public class ContinuousBackpack {
    public static void main(String[] args) {
        new ContinuousBackpack().run();

    }
    public void run(){
        Scanner scanner= new Scanner(System.in);

        int capacity = scanner.nextInt();
        int maxWeight = scanner.nextInt();
        Item[] items=new Item[capacity];
        for (int i = 0; i < capacity; i++) {
            items[i]=new Item(scanner.nextInt(),scanner.nextInt());
        }
        Arrays.sort(items);

        double result=0;

        for (Item item : items) {
            if(item.weight<=maxWeight){
                maxWeight-=item.weight;
                result+=item.cost;
            }else {
                result+=(double) item.cost*maxWeight/item.weight;

                break;

            }

        }
        System.out.println(result);





    }
}
class Item implements Comparable<Item>{
    int cost;
    int weight;

    public Item(int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "cost=" + cost +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Item o) {
        double r1=(double) this.cost/this.weight;
        double r2=(double) o.cost/o.weight;
        return -Double.compare(r1,r2);
    }
}
