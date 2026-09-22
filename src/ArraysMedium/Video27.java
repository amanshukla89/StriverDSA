package ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Video27 {

    //Next Permutation
    static class Solution {
        public void nextPermutation(int[] nums) {
            List<List<Integer>> perms = permute(nums.clone());
            Collections.sort(perms, (a, b) -> {
                for (int i = 0; i < a.size(); i++) {
                    int diff = a.get(i) - b.get(i);
                    if (diff != 0) return diff;
                }
                return 0;
            });
            for (int i = 0; i < perms.size(); i++) {
                List<Integer> p = perms.get(i);
                boolean match = true;
                for (int j = 0; j < nums.length; j++) {
                    if (p.get(j) != nums[j]) { match = false; break; }
                }
                if (match) {
                    List<Integer> next = perms.get((i + 1) % perms.size());
                    for (int j = 0; j < nums.length; j++) {
                        nums[j] = next.get(j);
                    }
                    return;
                }
            }
        }

        private List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            boolean[] used = new boolean[nums.length];
            List<Integer> path = new ArrayList<>();
            dfs(nums, used, path, res);
            return res;
        }

        private void dfs(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> res) {
            if (path.size() == nums.length) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) continue;
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
                used[i] = true;
                path.add(nums[i]);
                dfs(nums, used, path, res);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
    void main() {

    }
}
