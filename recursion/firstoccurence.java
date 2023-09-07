package recursion;

public class firstoccurence {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,8,9,5};
        System.out.println(occurence(arr,5,0));
    }
    public static int occurence(int arr[],int n,int i){//i is the index from where checking will start 
        if(i==arr.length-1){                            //n is the value whose occurence is to be checked
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return occurence( arr,n,i+1);
    }
}
