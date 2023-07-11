package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*По данным n отрезкам необходимо найти множество точек минимального размера,
 для которого каждый из отрезков содержит хотя бы одну из точек.
В первой строке дано число
1≤n≤100 отрезков. Каждая из последующих
n строк содержит по два числа0≤l≤r≤10, задающих начало и конец отрезка. Выведите оптимальное число,
m точек и сами m точек. Если таких множеств точек несколько, выведите любое из них.*/

public class CoverSegments {
    public static void main(String[] args) {
        new CoverSegments().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        Segment[] arrSegments = new Segment[size];
        for (int i = 0; i < size; i++) {
            arrSegments[i] = new Segment(scanner.nextInt(), scanner.nextInt());

        }


        Arrays.sort(arrSegments);


        int currentPoint = -1;
        int count = 0;

        ArrayList<Integer> integers = new ArrayList<>();


        for (int i = 0; i < size; i++) {

            if (currentPoint < arrSegments[i].getFirstDot()) {
                count++;
                currentPoint = arrSegments[i].getSecondDot();
                integers.add(currentPoint);
            }
        }
        System.out.println(count);
        for (Integer integer : integers) {
            System.out.print(integer + " ");

        }

    }


}


class Segment implements Comparable<Segment> {
    private int firstDot;
    private int secondDot;

    public Segment(int firstDot, int secondDot) {
        this.firstDot = firstDot;
        this.secondDot = secondDot;
    }

    public int getFirstDot() {
        return firstDot;
    }

    public void setFirstDot(int firstDot) {
        this.firstDot = firstDot;
    }

    public int getSecondDot() {
        return secondDot;
    }

    public void setSecondDot(int secondDot) {
        this.secondDot = secondDot;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "firstDot=" + firstDot +
                ", secondDot=" + secondDot +
                '}';
    }

    @Override
    public int compareTo(Segment o) {
        if (this.secondDot > o.secondDot) {
            return 1;
        } else if (this.secondDot < o.secondDot) {
            return -1;
        } else {
            return 0;
        }
    }
}

