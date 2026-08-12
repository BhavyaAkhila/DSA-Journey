class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        int start=0,end=0,result=0,count=0;

        while(end<nums.length){

            map.put(nums[end],map.getOrDefault(nums[end],0)+1);    

            if(map.get(nums[end])>k) {   

                while(start<end && nums[start]!=nums[end]){ 
                    map.put(nums[start],map.get(nums[start++])-1);
                    count--;
                }
                start++;
                map.put(nums[end],map.get(nums[end])-1); 

            }else{
                result=Math.max(result,++count); 
            }
            end++;
        }

        return result;
    }
}
