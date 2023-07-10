package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

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

        for (Segment arrSegment : arrSegments) {
            System.out.print(arrSegment);

        }


//        ArrayList<Integer> ints = new ArrayList<>();
//
//
//
//
//        for (int i = 0; i < size; i++) {
//            ints.add(arrSegments[i].getSecondDot());
//
//        }
//        System.out.println(ints);
//        int ind=0;
//
//        for (int i = 0; i < size; i++) {
//            if (ints.get(i)>=arrSegments[i+1].getFirstDot()){
//                return;
//
//            }else if(ints.get(i)>=arrSegments[i+1].getFirstDot()){
//                ints.remove(i);
//            }
//        }
//        System.out.println(ints);







            ArrayList<Integer> integers = new ArrayList<>();

        int ind=;

            for (int i = 1; i <size-1 ; i++) {
                if(integers.isEmpty()){
                    integers.add(arrSegments[0].getSecondDot());
                }
            if (arrSegments[i-1].getSecondDot()>=arrSegments[i].getFirstDot()){
                arrSegments[i].setSecondDot(arrSegments[i-1].getSecondDot());



            }else{
                ind++;
                i--;
            }



        }




        }
    }

    class Segment implements Comparable<Segment> {
        private int firstDot;
         private  int secondDot;

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

