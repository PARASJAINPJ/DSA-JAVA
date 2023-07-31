public class arrayswap {
    public static void main(String []args){
        int [] arr = new int[]{10,20,30,40,50};
        int i=0;
        int j=2;
        //non working swap
        System.out.println(arr[i]  + ","+ arr[j]);
        //swap(arr[i],arr[j]);
        // System.out.println(arr[i] +","+arr[j]);
        //working swap
        System.out.println(arr[i] + ","+arr[j]);
        swap(arr,i,j);
        System.out.println(arr[i]+","+arr[j]);


    }
    public static void swap(int[]arr,int i,int j){
        //System.out.println(arr[i]+","+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        //System.out.println(arr[i]+","+arr[j]);
    }
    
}
