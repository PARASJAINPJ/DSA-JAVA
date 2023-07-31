public class lowerandupperbound {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        System.out.println(lowerbound(arr,5));
        System.out.println(upperbound(arr,5));

        System.out.println(lowerbound(arr,1));
        System.out.println(upperbound(arr,1));
    }
    public static int lowerbound(int arr[],int data){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==data){
                ans=mid;
                high=mid-1;
            }else if(data<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static int upperbound(int arr[],int data){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==data){
                ans=mid;
                low=mid+1;
            }else if(data<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
