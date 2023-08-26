package leetcode;

import java.util.HashMap;
import java.util.Map;

//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters
// from magazine and false otherwise.
//
//Each letter in magazine can only be used once in ransomNote.
//Example 1:
//
//Input: ransomNote = "a", magazine = "b"
//Output: false
//Example 2:
//
//Input: ransomNote = "aa", magazine = "ab"
//Output: false
//Example 3:
//
//Input: ransomNote = "aa", magazine = "aab"
//Output: true
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            Integer currentCount = map.getOrDefault(c, 0);
            map.put(c,currentCount+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            Integer currentCount = map.getOrDefault(c, 0);
            if (currentCount==0){
                return false;
            }else {
                map.put(c,currentCount-1);
            }

        }
        return true;
    }
}
