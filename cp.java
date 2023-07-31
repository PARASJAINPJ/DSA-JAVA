  class cp {
    public static void Main(String[]args){
        int arr[]={1,2,3,4,5,6,7};
        int target=6;
        binary(arr,target);
    }
    


public static void binary(int arr[],int target){
    int n=arr.length-1;
    int start=0;
    int end=n-1;
    while(start<=end){
        int middle=(start+end)/2;
        if(arr[middle]==target){
            System.out.println(middle);
            return ;
        }
        elseif(arr[middle]<target){
            start=middle+1;
        }
        else{
            end=middle-1;
        }
    }
}

}
