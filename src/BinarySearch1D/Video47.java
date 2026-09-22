package BinarySearch1D;

public class Video47 {

    // Lower Bound
    static int lowerBound(int[] nums, int x) {

        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {

            int mid = (low + high) / 2;

            // nums[mid] can be an answer
            if (nums[mid] >= x) {
                ans = mid;

                // Try to find a smaller index on the left
                high = mid - 1;
            }
            else {
                // Need a bigger value
                low = mid + 1;
            }
        }

        return ans;
    }

    //Upperbound
    static int upperBound(int[] nums, int x) {

        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {

            int mid = (low + high) / 2;

            // nums[mid] can be an answer
            if (nums[mid] > x) {
                ans = mid;

                // Try to find a smaller index on the left
                high = mid - 1;
            }
            else {
                // nums[mid] <= x, so search right
                low = mid + 1;
            }
        }

        return ans;
    }

    // Find first and last position of target
    static int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);

        // Target does not exist-->Edge case
        if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        int ub = upperBound(nums, target);

        return new int[]{lb, ub - 1};
    }
    void main() {

        int[]nums ={5,7,7,8,8,10};
        for(int k : searchRange(nums,8)){
            System.out.println(k);
        }

    }
}
