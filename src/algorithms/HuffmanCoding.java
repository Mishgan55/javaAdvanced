package algorithms;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/*По данной непустой строке s длины не более 10000, состоящей из строчных букв латинского алфавита, постройте оптимальный беспрефиксный код.
В первой строке выведите количество различных букв
k, встречающихся в строке, и размер получившейся закодированной строки. В следующих
k строках запишите коды букв в формате "letter: code". В последней строке выведите закодированную строку.*/

public class HuffmanCoding {

    class Node implements Comparable<Node>{
        final int sum;
        String code;

        public Node(int sum) {
            this.sum = sum;
        }
        void buildCode(String code){
            this.code=code;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(sum,o.sum);
        }
    }
    class InternalNode extends Node{

        Node left;
        Node right;

        public InternalNode(Node left, Node right) {
            super(left.sum+ right.sum);
            this.left = left;
            this.right = right;
        }

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            left.buildCode(code+"0");
            right.buildCode(code+"1");
        }
    }

    class LeafNode extends Node{
        char symbol;

        public LeafNode( char symbol,int count) {
            super(count);
            this.symbol = symbol;
        }

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            System.out.println(symbol+": "+code);
        }
    }

    public static void main(String[] args) {
        new HuffmanCoding().run();
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }


        }

        PriorityQueue<Node> queue = new PriorityQueue<>();
        Map<Character, Node> charNodes = new HashMap<>();
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            LeafNode leafNode=new LeafNode(characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
            charNodes.put(characterIntegerEntry.getKey(),leafNode);
            queue.add(leafNode);

        }
        int sum = 0;
        while (queue.size() > 1) {
            Node first = queue.poll();
            Node second = queue.poll();
            InternalNode node = new InternalNode(first, second);
            sum += node.sum;
            queue.add(node);
        }
        if (map.size() == 1) {
            sum = s.length();
        }
        System.out.println(map.size() + " " + sum);
        Node root = queue.poll();
        if (map.size() == 1)
        {
            root.buildCode("0");
        }else{
        root.buildCode("");
        }

        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stringBuilder.append(charNodes.get(c).code);

        }
        System.out.println(stringBuilder);
    }
}
