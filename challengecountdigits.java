import java.util.Scanner;

public class challengecountdigits {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int digit=scn.nextInt();
        int i=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            if(rem==digit){
                i++;
            } 

        }
        System.out.println(i);
    }
}
