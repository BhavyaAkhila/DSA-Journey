class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        boolean[] memo=new boolean[101];
        for(int num:nums){
            memo[num]=true;
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        List<Integer>res=new ArrayList();
        for(int i=min;i<=max;i++){
     if(memo[i]==false)res.add(i);
        }
        return res;
    }
}
