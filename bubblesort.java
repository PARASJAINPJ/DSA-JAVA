//sorting 
public class bubblesort {
    public static void main(String[]args){
        int arr[]={127525,22,5275,252725723,1};
        bubblesort(arr);
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    } 
    public static void bubblesort(int arr[]){
        for(int count=0;count<arr.length;count++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){//this is for sorting in increasing order and for sorting in decreasing order arr[j]<arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
}
