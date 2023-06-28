package lists;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    public void add(int value){
        if(head==null){
            this.head= new Node(value);
        }else{
            Node temp=head;
            while (temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(new Node(value));

        }
        size++;
    }
    public int get(int index){
        int currentIndex=0;
        Node temp=head;
        while (temp!=null){

            if (currentIndex==index){
                return temp.getValue();
            }else{
            temp=temp.getNext();
            currentIndex++;}


        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        int[] ints=new int[size];
        int index=0;
        Node temp=head;
        while (temp!=null){
        ints[index++]= temp.getValue();
            temp=temp.getNext();}
        return Arrays.toString(ints);


    }

    private static class Node{
       private int value;
        private Node next;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
