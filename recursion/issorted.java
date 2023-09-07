package recursion;


public class issorted {
    public static void main(String[] args) {
        
    
    int arr[]={1,2,3 ,4,5};
    System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int arr[],int i) {//i is for index to check from which index array is sorted or not
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
    return sorted(arr, i+1);
}
}

