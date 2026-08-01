 import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                return true;
            }
            left++;
            right++;
        }
        return false;
    }
}
//using hashset
import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ele=new HashSet<>();
        for(int num:nums){
            if(ele.contains (num))
            return true;
            ele.add(num);
        }
        return false;
    }
}

