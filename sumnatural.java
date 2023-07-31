import java.util.Scanner;

public class sumnatural {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i = 1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.println(sum);





    }
    
}
