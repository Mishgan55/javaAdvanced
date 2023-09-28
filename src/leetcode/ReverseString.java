package leetcode;
//Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.
//
//Example 1:
//
//Input: s = ["h","e","l","l","o"]  o e l l h    o l l e h
//Output: ["o","l","l","e","h"]
//Example 2:
//
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
public class ReverseString {

    public void reverseString(char[] s) {

        int index=0;
        for (int i = s.length-1; i >=index; i--) {
            char temp=s[i];
            s[i]=s[index];
            s[index]=temp;
            index++;
        }

    }
}
