class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)//it is for all n numbers
        {
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++)//it is for perfect squares
            {
                //here we need to reduce and check for the rem.
                int rem=i-j*j;
                if(dp[rem]<min)
                {
                    min=dp[rem];
                }
            }
            dp[i]=min+1;
        }
        return dp[n];
    }
}
