package ArraysMedium;

public class Video29 {

    //Replace Elements with Greatest Element on Right Side
    static int[] replaceElementsBrute(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int rightMax = -1;
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            ans[i] = rightMax;
        }
        return ans;
    }

    static int[] replaceElementsOptimal(int[] arr) {
        int n = arr.length;
        int rightMax = -1;
        int[] ans = new int[n];
        for(int i = n-1;i >= 0;i--) {
            ans[i] = rightMax;
            rightMax = Math.max(rightMax,arr[i]);
        }
        return ans;
    }
    void main() {

        int[] brr = {17,18,5,4,6,1};
        for (int k:replaceElementsOptimal(brr)) {
            System.out.print(k +" ");
        }

    }
}
