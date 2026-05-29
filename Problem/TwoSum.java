import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {};
        int target = 5;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }

    
    static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        if(nums == null || nums.length < 2){
            return new int[] {};
        }

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }

}