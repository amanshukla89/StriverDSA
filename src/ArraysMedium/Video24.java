package ArraysMedium;

public class Video24 {

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
    void main () {
        int[] brr = {1, 2, 3, 1, 1, 1, 1};
        int target = 3;
        System.out.println("Length of max subarray whose sum is equal to given target: "
                + longestSubarrayBrute(brr,target));
    }
}
