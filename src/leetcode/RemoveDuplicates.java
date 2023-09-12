package leetcode;
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int resultSize=0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[resultSize]!=nums[i]){
                resultSize++;
                nums[resultSize]=nums[i];

            }
        }
        return  resultSize+1;
    }
}
