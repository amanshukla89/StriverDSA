package ArraysEasy;

import java.util.Arrays;
import java.util.TreeSet;

public class Arrays1 {

    //Q-1: Largest element in an array
    //Brute Solution:Sorting
    //TC:O(N LogN)
    //SC:O(1)
    static int LargestElement1(int[]arr) {
        Arrays.sort(arr);

        //Largest Element
        return (arr[arr.length - 1]);
    }

    //Optimal Solution:Linear Search
    //TC:O(n)
    //SC:O(1)
    static int LargestElement2(int[]arr) {
        int n = arr.length;
        int largest = arr[0];
        for(int i = 0;i < n;i++) {
            if(arr[i] > largest) {
                //largest Element
                largest = arr[i];
            }
        }
        return largest;
    }

    //Q-2: Second Largest element in an array
    //Brute Solution:Sorting + Iterate
    //TC:O(N LogN + n)
    //SC:O(1)
    static int secondLargest1(int[] arr) {
        int largest = LargestElement1(arr);
        int n = arr.length;
        int slargest = -1;
        for(int i = n - 2;i >= 0;i--){
            if(arr[i] != largest) {
                slargest = arr[i];
                break;
            }
        }
        return slargest;
    }

    //Q-2: Second Largest element in an array
    //Better Solution:Linear Search + Iterate
    //TC:O(n+ n) = O(2n)
    //SC:O(1)
    static int secondLargest2(int[] arr) {
        int largest = LargestElement2(arr);
        int n = arr.length;
        int slargest = -1;
        for(int i = n - 2;i >= 0;i--){
            if(arr[i] != largest) {
                slargest = arr[i];
                break;
            }
        }
        return slargest;
    }

    //Q-2: Second Largest element in an array
    //Optimal Solution:for + if-else
    //TC:O(n)
    //SC:O(1)
    static int secondLargest3(int[] arr) {
        int largest = arr[0];
        int slargest = -1;
        int n = arr.length;
        for(int i = 1;i < n;i++) {
            if(arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    //Q-3:Check if the array is sorted
    //Note:Only Optimal Solution
    //TC:O(N)
    //SC:O(1)
    static boolean arraySorted(int[]arr) {
        int n = arr.length;
        for(int i = 0; i < n;i++) {
            if(arr[i+ 1] < arr[i]){
                return false;
            }
        }
        return true;
    }

    //Q-4:Remove Duplicates IN-PLACE from sorted array
    //Brute Solution:USING SET DATA STRUCTURE
    //TC:o(nlog n)
    //SC:O(n)
    static int removeDuplicates1(int[] nums) {
        TreeSet<Integer> unique = new TreeSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        int i = 0;
        for (int num : unique) {
            nums[i++] = num;
        }
        return unique.size();
    }

    //Q-4:Remove Duplicates IN-PLACE from sorted array
    //Optimal Solution:Two Pointer
    //TC:O(n)
    //SC:O(1)
    static int removeDuplicates2(int[]arr) {
        int n = arr.length;
        int i = 0;
        for(int j = 1;j < n;j++) {
            if(arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return (i + 1);
    }


    void main() {

        int arr[] = {1, 1, 2};
        System.out.println(removeDuplicates2(arr));
    }
}
