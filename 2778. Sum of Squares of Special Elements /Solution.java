class Solution {
    public int sumOfSquares(int[] nums) {
        int N=nums.length;
        int ans=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                ans+=nums[i-1]*nums[i-1];
            }
        }
        return ans;   
    }
}
