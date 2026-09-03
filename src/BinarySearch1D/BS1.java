package BinarySearch1D;

public class BS1 {

    //basic problem for Binary Search
    //TC:O(LOGN)
    static  int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(target > nums[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    //lower bound
    static int lowerBound(int[]arr,int n,int x) {
        n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            //may be an answer
            if(arr[mid] >= x) {
                ans = mid;
                //look for more small index on the left
                high = mid - 1;
            }
            else {
                // look in right
                low = mid + 1;
            }
        }
        return ans;
    }

    //Upper bound
    static int upperBound(int[]arr,int n,int x) {
        n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            //may be an answer
            if(arr[mid] > x) {
                ans = mid;
                //look for more small index on the left
                high = mid - 1;
            }
            else {
                // look in right
                low = mid + 1;
            }
        }
        return ans;
    }

    //Floor and Ceil in an array
    
    void main() {

        int[] brr = {-1,0,3,5,9,12};
        System.out.println(search(brr,9));


    }
}
