import java.util.Scanner;

public class maxinarray {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int [] array=takeinput();
        display(array);
       System.out.println(max(array));

    }
    public static int max(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
    public static int[] takeinput(){
        System.out.println("size ?");
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
          System.out.println("enter the value for"+ i +"index");
          arr[i]=scn.nextInt();
        }
    return arr;
 }
    public static void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
