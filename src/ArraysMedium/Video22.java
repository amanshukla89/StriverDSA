package ArraysMedium;

public class Video22 {

    //SORT 1'S /2'S/3'S
    //BRUTE-->Merge Sort

    //Better
    //TC-->
    //SC-->
    static void sort0s1s2s (int[] arr) {
        int n = arr.length;
        int count1= 0;
        int count0 = 0;
        int count2 = 0;
        for(int i = 0;i < n;i++) {
            if(arr[i] == 0) {
                count0++;
            }if (arr[i] == 1) {
                count1++;
            }
            if(arr[i] == 2) {
                count2++;
            }
        }

        for(int i = 0;i < count0;i++) {
            arr[i] = 0;
        }
        for(int i =count0;i < count0+ count1;i++) {
            arr[i] = 1;
        }
        for(int i =count0+ count1;i <n;i++) {
            arr[i] = 2;
        }
    }

    //Optimal
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void sortColorsOptimal(int[] nums) {
        int low = 0;int mid = 0;int high = nums.length - 1;
        //till we have unsorted section
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums,mid,high);
                high--;
            }
        }
    }
    void main() {

        int[] brr = {0,1,0,2,0,1,1,2,1,0,1,0};
        sortColorsOptimal(brr);
        for(int nums:brr) {
            System.out.print(nums + " ");
        }
    }
}
