package lists;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(5);
        myLinkedList.add(15);
       System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        myLinkedList.remove(3);
        System.out.println(myLinkedList);

    }

}
