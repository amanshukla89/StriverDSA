package ArraysMedium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Video30 {
    //Longest sequence of array
    static int longestConsecutiveBetter(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int n =nums.length;
        float lastSmaller = Float.NEGATIVE_INFINITY;
        int count = 0;
        int longest = 1;

        for(int i = 0;i< n;i++) {
            if(nums[i] - 1 == lastSmaller) {
                count += 1;
                lastSmaller = nums[i];
            }
            else if( lastSmaller != nums[i]) {
                count  = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }

    static int longestConsecutiveOptimal(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int n = nums.length;
        for(int num:nums) {
            numSet.add(num);
        }
        int longest = 0;
        for(int num : numSet) {
            if(!numSet.contains(num - 1)) {
                int length = 1;
                while(numSet.contains((num + length))) {
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
    void main(){
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutiveOptimal(nums));

    }
}
