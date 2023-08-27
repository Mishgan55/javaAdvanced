package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//Example 1:
//
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//Example 2:
//
//Input: nums = [1,0,1,1,0,1]
//Output: 2
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxWealth=0;
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                maxWealth++;
            }
            if (nums[i]==0 || i+1==nums.length){
                list.add(maxWealth);
                maxWealth=0;
            }
        }
        list.sort(Collections.reverseOrder());

        return list.get(0);
    }
}
