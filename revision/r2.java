//binary search using recursion
package revision;

public class r2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,66,78};
        System.out.println((search(arr,78,0,arr.length-1)));
    }
    static int search(int arr[],int target,int s,int e){
        if(s>e){
            return e;
        }
        int m=s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }
}
