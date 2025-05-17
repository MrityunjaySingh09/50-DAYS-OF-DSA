import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                // add() returns false if num already exists
                return true; // Duplicate found
            }
        }

        return false; // No duplicates
    }
}
