package ArraysEasy;

import java.util.HashSet;
import java.util.Set;

public class Arrays3 {



    //Find the number that appears once, and other numbers twice.
    //BRUTE SOLUTION
    static int numAppearOnceBrute(int[] arr) {
        int n = arr.length;
        for(int i = 0;i < n;i++) {
            int num = arr[i];
            int count = 0;
            for(int j = 0;j< n;j++) {
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1) {
                return  num;
            }

        }
        return  -1;
    }

    //Better
    static int numAppearOnceBetter(int[] arr){
        Set <Integer> seen = new HashSet<>();
        for(int num : arr) {
            if(seen.contains(num)) {
                seen.remove(num);
            }
            else {
                seen.add(num);
            }
        }
        return seen.iterator().next();
    }

    //BETTER
    static int numAppearOnceOptimal(int[] arr) {
        int xor = 0;
        for(int i = 0;i < arr.length;i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
    void main() {

        int[] nums={2, 2, 1};
        System.out.println("Number that appear once: " + numAppearOnceBrute(nums));
        System.out.println("Number that appear once: " + numAppearOnceBetter(nums));
        System.out.println("Number that appear once: " + numAppearOnceOptimal(nums));

    }
}
