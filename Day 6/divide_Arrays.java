//Leetcode medium level question
class divide_Arrays {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=0;
        int [][] arr=new int [n/3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<3;j++){
                if(c<n-1 && (c+3)%3==0 && nums[c+2]-nums[c]>k){
                    return new int [0][0];
                }
                arr[i][j]=nums[c++];
            }
        }
        return arr;
    }
}
