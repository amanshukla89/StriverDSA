package ArraysEasy;

public class Video18 {

    //REVERSE AN ARRAY
    static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    //swap elements of array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Q-1:Left rotate array by one place
    //Optimal Solution
    //TC:O(N)
    //SC:O(1)
    static void leftRotateByOne1(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1;i< n;i++){
            arr[i-1] = arr[i];
        }
        arr[n - 1] = temp;

    }

    //Q-2:Right rotate array by k place
    //Brute Solution
    //TC:O(N * k)
    //SC:O(1)
    static void rightRotateByK1(int[] nums,int k){
        int n = nums.length;
        k %= n;
        while (k > 0) {
            int tmp = nums[n - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = tmp;
            k--;
        }
    }

    //Q-2:Left rotate  by k places
    //Brute Solution
    //TC:O(n + d)
    //SC:O(d)
    static void leftRotateByk1(int[] arr,int d) {
        int n = arr.length;
        d = d % n;

        int[] temp = new int[d];

        // Store first d elements
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Put temp elements at the end
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
    }

    //Q-2 LEFT ROTATE BY K PLACES
    //OPTIMAL SOLUTION
    //TC:O(2n)
    //SC:O(1)
    static void leftRotateByk2(int[] arr,int k) {
        int n = arr.length;
        k = n % k;
        // Reverse first K elements
        reverse(arr,0,k-1);

        // Reverse remaining elements
        reverse(arr,k,n-1);

        // Reverse the entire array
        reverse(arr,0,n-1);
    }

    //Right ROTATE BY K PLACES
    //Optimal Solution
    //TC:O(2n)
    //SC:O(1)
    static void rightRotateByk3(int[] arr, int d) {

        int n = arr.length;
        d = d % n;

        // Reverse the whole array
        reverse(arr, 0, n - 1);

        // Reverse first d elements
        reverse(arr, 0, d - 1);

        // Reverse remaining elements
        reverse(arr, d, n - 1);
    }

    //Move zeroes to the end
    //Brute Solution
    //Time  = O(n)
    //Space = O(n)
    static void moveZeroesToEnd1(int[] arr) {
        int[] temp = new int[arr.length];
        int idx = 0;

        //Store all non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }

        //Put the non-zero elements back
        int nz = idx;
        for (int i = 0; i < nz; i++) {
            arr[i] = temp[i];
        }

        //Fill the remaining positions with zero
        for (int i = nz; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    //Move zeroes to the end
    //Optimal Solution
    //Time  = O(n)
    //Space = O(1)
    static void moveZeroesToEnd2(int[] arr) {
        int n = arr.length;
        int j = -1;

        //find first zero element
        for(int i = 0;i < n;i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        // No zero found
        if (j == -1) {
            return;
        }

        // Start swapping
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }

    }

    //Find Union of two sorted array
    //Brute solution




    void main() {
        int[] brr = {34,5,6,7,1};

        for(int i:brr) {
            System.out.print(i+ " ");
        }
    }
}
