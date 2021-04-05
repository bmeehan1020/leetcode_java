/**
 * CTCI
 * Solved? NO
 */

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                hs.add(Arrays.asList(nums[i], nums[j]));
            }
        }
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (List<Integer> pair : hs){
            for (int n : nums) {
                if (n == -(pair.get(0) + pair.get(1))) {
                    result.add(Arrays.asList(n, pair.get(0), pair.get(1)));
                    hs.remove(Arrays.asList(n, pair.get(0)));
                    hs.remove(Arrays.asList(n, pair.get(1)));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        ts.threeSum(new int[]{3, 0, -2, 2, 5});
    }
}