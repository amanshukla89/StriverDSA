package ArraysMedium;


public class Video24 {

    //Maximum Subarray sum
    //Brute
    static int maxSubarraySum(int[] nums) {
        int n = nums.length, res = nums[0];
        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int j = i; j < n; j++) {
                cur += nums[j];
                res = Math.max(res, cur);
            }
        }
        return res;
    }

    //optimal
   static int maxSubArray(int[] nums) {
        int maxSub = nums[0], curSum = 0;
        for (int num : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += num;
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }


    void main() {
        int[] brr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Ans: " +maxSubarraySum(brr));

    }
}
