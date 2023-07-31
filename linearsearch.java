import java.util.Scanner;
public class linearsearch {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int[] arr=takeinput();
        System.out.println("NOW enter the item to be searched");
        int item=scn.nextInt();
        System.out.println("element is found at index " + max(arr,item));

    }
    public static int[] takeinput(){
        System.out.println("enter the size of array");
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the value for"+ i +"index");
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static int max(int[]array,int n){
        for(int i=0;i<array.length;i++){
        if(array[i]==n){
           return i;
        }
       } 
       return -1;
    }

    
}
