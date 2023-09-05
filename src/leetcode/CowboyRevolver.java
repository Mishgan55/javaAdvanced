package leetcode;

import java.io.*;
import java.util.*;

public class CowboyRevolver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ns = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = ns[0];
        int s = ns[1];

        int[] prices = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(prices);

        int affordableRevolver = 0;
        for (int price : prices) {
            if (price <= s) {
                affordableRevolver = price;
            } else {
                break;
            }
        }

        System.out.println(affordableRevolver);
    }
}