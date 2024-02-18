public class quickSort {
    public static int partition(int [] arr,int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i;
    }
    public static void quickSort2(int [] arr,int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort2(arr,low,pidx-1);
            quickSort2(arr,pidx+1,high);
        }


    }
    public static void main(String[] args) {
        int [] arr={6,3,9,5,2,8};
        int n= arr.length;
        quickSort2(arr,0,n-1);
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
