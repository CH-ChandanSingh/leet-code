import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 66};
        int[] indices = twoSum(nums, 9);
        System.out.println(Arrays.toString(indices));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> keyAndValue = new HashMap<>();

        
        for(int i =0; i< nums.length; i++) {
            
            int compelemnt = target - nums[i];

            if(keyAndValue.containsKey(compelemnt)) {
                return new int[] {keyAndValue.get(compelemnt), i};
            } 
            else {
                keyAndValue.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}