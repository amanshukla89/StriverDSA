package ArraysEasy;

import java.util.HashMap;

public class Arrays5 {

    //2 SUM PROBLEM
    //BRUTE
    static int[] twoSumBrute(int[] arr,int target) {
        int n = arr.length;
        for(int i = 0;i < n;i++) {
            for(int j = i + 1;j <n;j++) {
                if(arr[i] + arr[j] == target) {
                    //return true;
                    //for indices
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }

    //Better
//    static int[] twoSumBetter(int[] arr,int target){
//        HashMap<Integer, Integer> prevMap = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
//            int diff = target - num;
//
//            if (prevMap.containsKey(diff)) {
//                return new int[] { prevMap.get(diff), i };
//            }
//
//            prevMap.put(num, i);
//        }
//        return -1
//    }

    //OPTIMAL:TWO POINTER
    static boolean twoSumOptimal(int[] arr,int target) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while( l <= n /2) {
            if(arr[l] + arr[r] == target) {
                return true;
            }
            if(arr[l] + arr[r] > target) {
                r--;
            }
            if(arr[l] + arr[r] < target) {
                l++;
            }
        }
        return false;
    }

    void main() {
    }
}
