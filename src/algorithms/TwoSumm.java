package algorithms;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* ищет в массиве два числа которые дадут сумму нужного числа О(n)*/
public class TwoSumm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSumm().twoSums(new int[]{3, 2, 6, 7, 15}, 10)));

    }


    public int[] twoSums(int[] nums, int targetSum) {
        Set<Integer> set= new HashSet<>();
        int[] arr = new int[2];
        for (int num : nums) {
            set.add(num);

            if (set.contains(targetSum-num)){
                arr[0]=targetSum-num;
                arr[1]=num;
                return arr;
            }

        }
   return new int[0];

    }
}
