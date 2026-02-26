import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(current, i);
        }
        
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = obj.twoSum(nums, target);
        
        System.out.println(Arrays.toString(result));
    }
}