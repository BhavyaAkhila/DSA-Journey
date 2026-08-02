class Solution {
    public int maxProduct(int n) {
         int a=Integer.MIN_VALUE;
        int b=Integer.MIN_VALUE;
        while(n!=0){
            int temp=n%10;
            if(temp>=a){ 
                b=a;
                a=temp;
                }
            else if(temp>b) b=temp;
            n=n/10;
        }
        return a*b;
    }
}
