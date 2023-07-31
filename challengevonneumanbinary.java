import java.util.Scanner;
import java.lang.Math;

public class challengevonneumanbinary {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        
            while(t!=0){
                int n=scn.nextInt();
                int p=0;
                double dec=0;
                while(n!=0){
                    int rem=n%10;
                    dec=dec+rem*Math.pow(2,p);
                    n=n/10;
                    p++;
                    }
                System.out.println((int)dec);
                t--;
            }
        
    }
}
