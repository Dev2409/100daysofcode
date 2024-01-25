class Solution {
    public int getWinner(int[] arr, int k) {
        int win=0;
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>curr){
                curr=arr[i];
                win=0;
            }
            win++;
            if(win==k){
                break;
            }
        }
        return curr;
    }
}
