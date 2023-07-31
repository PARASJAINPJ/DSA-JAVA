//for binary search array should be sorted
public class binarysearch {
    public static void main(String[]args){
        int [] array={5,7,10,12,15,20,27,31,36,42,55,58,60,65,70,80};
        System.out.println(binarysearch(array,15));
    }
    public static int binarysearch(int []arr,int n){
        int low=0;
        int high=arr.length -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<n){
             low=mid+1;
            }else if(arr[mid]>n){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
