import java.util.*;

/**
 * CTCI
 * Solved? NO
 */
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (Integer n : nums) {
            set.put(n, set.getOrDefault(n, 0) + 1);
        }


        ArrayList<List<Integer>> result = new ArrayList<>();
//        for (List<Integer> pair : set){
//            for (int n : nums) {
//                if (n == -(pair.get(0) + pair.get(1))) {
//                    result.add(Arrays.asList(n, pair.get(0), pair.get(1)));
//                    set.remove(Arrays.asList(n, pair.get(0)));
//                    set.remove(Arrays.asList(n, pair.get(1)));
//                }
//            }
//        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        ts.threeSum(new int[]{3, 0, -2, 2, 5});
    }
}