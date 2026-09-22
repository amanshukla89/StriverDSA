package ArraysEasy;

import java.util.HashMap;

public class Video20 {
    //Longest subarray ki length btao jiska sum k ke equal aaye

    static int longestSubarrayBrute(int[] arr, int k) {

        int maxLen = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++) {

            int sum = 0;

            for(int j = i; j < n; j++) {

                sum = sum + arr[j];

                if(sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    //Better
    static int longestSubarrayBetter (int[] arr,int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            // Case 1: subarray starts from index 0
            if(sum == k) {
                maxLen = i + 1;
            }

            // Case 2: prefix sum exists
            int rem = sum - k;

            if(map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Store first occurrence only
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    //Optimal-->Two pointer Approach
    static int longestSubarrayOptimal(int[] arr,int k) {
        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLen = 0;

        while(right < n) {
            sum = sum + arr[right];
            while(sum > k) {
                sum = sum - arr[left];
                left++;
            }

            if(sum == k) {
                maxLen = Math.max(maxLen,right - left + 1  );
            }
            right++;
        }
        return maxLen;
    }

    void main() {
            int[] brr = {1, 2, 3, 1, 1, 1, 1};
            int target = 3;
            System.out.println("Length of max subarray whose sum is equal to given target: "
                    + longestSubarrayBrute(brr,target));

            System.out.println("Length of max subarray whose sum is equal to given target: "
                    + longestSubarrayBetter(brr,target));

            System.out.println("Length of max subarray whose sum is equal to given target: "
                    + longestSubarrayOptimal(brr,target));
        }


}

