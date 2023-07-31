import java.util.Scanner;

public class challengesimpleinput {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {
        
        int arr[]=new int[100];
		int sum=0;
        for(int i=0;i<arr.length;i++){
             arr[i]=scn.nextInt();
			 sum=sum+arr[i];
             
             if(sum<0){
                break;
             }
             System.out.println(arr[i]);

    }
}
}