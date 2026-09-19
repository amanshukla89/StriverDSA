package ArraysMedium;

import java.util.HashMap;

public class Video23 {

    //Majority Element
    //Brute
    static int majorityElementBrute(int[] nums) {
        int n = nums.length;
        for(int i = 0;i < n;i++) {
            int count = 0;
            for(int j = 0;j < n;j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }
            if(count > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    //Better
    static int majorityElementBetter(int[] nums){
        HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0, maxCount = 0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > maxCount) {
                res = num;
                maxCount = count.get(num);
            }
        }
        return res;
    }

    //Optimal
    static int majorityElementOptimal(int[] nums) {
        int el = 0;
        int count = 0;
        //algo
        for(int i = 0;i < nums.length;i++) {
            if(count == 0) {
                count = 1;
                el = nums[i];
            }
            else if (nums[i] == el) {
                count++;
            }
            else  {
                count--;
            }
        }

        //verify
        int count1 = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] == el) {
                count1++;
            }
        }
        if(count1 > nums.length / 2) {
            return el;
        }
        return  -1;

    }
    void main () {

        int[] brr = {3,2,3};
        System.out.println("Majority Element: " + majorityElementBrute(brr));
        System.out.println("Majority Element: " + majorityElementBetter(brr));
        System.out.println("Majority Element: " + majorityElementOptimal(brr));

    }
}
