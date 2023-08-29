package leetcode;
//Given an array nums of integers, return how many of them contain an even number of digits.
//
//Example 1:
//
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation:
//12 contains 2 digits (even number of digits).
//345 contains 3 digits (odd number of digits).
//2 contains 1 digit (odd number of digits).
//6 contains 1 digit (odd number of digits).
//7896 contains 4 digits (even number of digits).
//Therefore only 12 and 7896 contain an even number of digits.
//Example 2:
//
//Input: nums = [555,901,482,1771]
//Output: 1
//Explanation:
//Only 1771 contains an even number of digits.
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int counter=0;
        int flag=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<10){
                continue;
            }
            while (nums[i]>=10){
                nums[i]=nums[i]/10;
                counter++;
            }
            if (counter%2!=0){
                flag++;
            }
            counter=0;
        }


        return flag;

    }
}
