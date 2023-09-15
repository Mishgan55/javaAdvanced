package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]
public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                int temp=max;
                max=arr[i];
                arr[i]=temp;
            }
            else
                arr[i]=max;
        }
        return arr;
    }
}
