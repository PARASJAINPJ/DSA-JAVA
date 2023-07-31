public class selectionsort {
    public static void main(String[]args){
        int arr[]={88,11,44,99,55};
        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void selectionsort(int arr[]){
        for(int count=0;count<arr.length-1;count++){
            int min=count;
            for(int j=count+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                min=j;
                }
            }
                int temp=arr[min];
                arr[min]=arr[count];
                arr[count]=temp;
            
        }
    }
    
}
