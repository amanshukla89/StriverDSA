package ArraysMedium;

import java.util.ArrayList;
import java.util.List;

public class Video26 {

    //Rearrange Array Elements by Sign
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int []ans = new int[n];
        int posInd = 0;
        int negInd = 1;
        for(int i =0;i < n;i ++) {
            if(nums[i] < 0) {
                ans[negInd] = nums[i];
                negInd += 2;
            }
            else {
                ans[posInd] = nums[i];
                posInd += 2;
            }
        }
        return ans;
    }

    //Alternate Numbers
    static int[] alternateNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int k : nums) {
            if(k < 0) {
                neg.add(k);
            }
            else {
                pos.add(k);
            }
        }

        if(pos.size() > neg.size()) {
            for(int i = 0;i < neg.size();i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for(int i = neg.size();i < pos.size();i++) {
                nums[index] = pos.get(i);
                index++;
            }
        }
        else {
            for(int i = 0;i < pos.size();i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for(int i = pos.size();i < neg.size();i++) {
                nums[index] = neg.get(i);
                index++;
            }
        }
        return nums;
    }
    void main() {
        int[] nums = {3,1,-2,-5,2,-4,9,8,7};

        for(int k: alternateNumbers(nums)) {
            System.out.println(k+" ");
        }
    }
}
