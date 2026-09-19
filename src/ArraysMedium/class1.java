package ArraysMedium;

public class class1 {
    //Problem-1
    //TwoSum
    //type-1:Is there exist any elements jinka sum target ke equal aaye

    //Brute
    //TC:O(N * N)
    static boolean checkTwoSum1(int[] arr,int target) {
        int n = arr.length;
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                if(i == j) {
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    // return i,j
                    return true;
                }
            }
        }
        return false;
    }

    //BETTER
    //TC: O(N*LOGN)
//    static boolean checkTwoSumHashing(int[] arr,int target,int n) {
//        n = arr.length;
//    }

    //OPTIMAL:GREEDY APPROACH (DOESN'T WORK IF GIVEN ARRAY IS UNSORTED) AND INDEXES HAS BEEN ASKED
    //TC
    //SC:
    static int[] checkSumTwoPointer(int[] arr,int target){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j) {
            if (arr[i] + arr[j] > target)  {
                j--;
            }
            else if(arr[i] + arr[j] <target) {
                i++;
            } else {
                return new int[]{i, j};
            }

        }
        return new int[]{-1, -1};
    }


    //type-2:Tell me the indexes of such elements jinka sum target ke equal aaye

    void main() {

        int[] arr = {1, 2, 4, 6, 8};
        int target = 10;
        checkSumTwoPointer(arr,target);

    }
}
