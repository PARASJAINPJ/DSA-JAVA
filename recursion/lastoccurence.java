package recursion;

public class lastoccurence {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,8,9,5};
        System.out.println(occurence(arr,5,0));
    }
    public static int occurence(int arr[],int n,int i){
        if(i==arr.length-1){
            return -1;
        }
        int isfound=occurence(arr,n,i+1);
        if(isfound==-1 && arr[i]==n){
            return i;
        }
        
        return isfound;

    }
}