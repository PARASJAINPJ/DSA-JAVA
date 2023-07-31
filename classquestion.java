//product of array except self
import java.util.Scanner;

public class classquestion {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        product(arr);
    }

    public static void product(int arr[]){
        for(int i=0;i<arr.length;i++){
            int prod=1;
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    prod=prod*arr[j];
                }
            }
            System.out.print(prod+" ");
        }
    } 
} 

