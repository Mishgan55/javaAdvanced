package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;

public class ContinuousBackpack {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int maxStaff;
        int maxValue;

        ArrayList<Item> objects = new ArrayList<>();

        String[] first=bufferedReader.readLine().split(" ");
        maxStaff = Integer.parseInt(first[0]);
        maxValue= Integer.parseInt(first[1]);
        for (int i = 0; i < maxStaff; i++) {
            String[] second=bufferedReader.readLine().split(" ");
            objects.add(new Item(Integer.parseInt(second[0]),Integer.parseInt(second[1])));
        }
        bufferedReader.close();

        Collections.sort(objects);

        double valuePrice=0.0;


        for (Item item:
             objects) {
            if (item.size<maxValue) {
                maxValue -= item.size;
                valuePrice += item.price;
            }else {
                valuePrice+=((double) maxValue/(double)item.size)* item.price;
                System.out.printf("%.3f",valuePrice);
                break;


            }


        }





        System.out.println(objects);

    }


}




class Item implements Comparable<Item>{
    int price;
    int size;

    public Item(int price, int size) {
        this.price = price;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int priceForOne(){
        return price/size;
    }

    @Override
    public int compareTo(Item o) {
        if ((double)this.price/(double)this.size>(double)o.getPrice()/(double)o.getSize()){
            return -1;
        }else if ((double)this.price/(double)this.size<(double)o.getPrice()/(double)o.getSize()){
            return 1;
        }else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", size=" + size +
                '}';
    }
}
