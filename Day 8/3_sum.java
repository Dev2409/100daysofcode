class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        Arrays.sort(nums);
        int res;
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                res=nums[left]+nums[right]+nums[i];
                if(res<0){
                    left++;
                }
               else if(res>0){
                    right--;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }

            }

        }
        return result;
    }
}
