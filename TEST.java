//assignmentb 2 question 1
import java.util.Scanner;
public class TEST {
    public static void main(String args[]) {
    Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++){
		arr[i]=scn.nextInt();
	} 
	for(int i=n-1;i>=0;i--){
		System.out.print(arr[i] +" ");
	}
   }
}

