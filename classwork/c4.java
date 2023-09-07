package classwork;
public class c4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);

    }
    public static int[] reverse(int arr[]){
       int res[]=new int[arr.length];
       int i=arr.length-1;
       int idx=0;
       while(i>=0){
        res[idx]=arr[i]
       }
       arr=res;
       i--;
       idx++;
       return arr;
    }
}
