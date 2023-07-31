import java.util.Scanner;
import java.lang.Math;

public class challengequadraticequations{
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        if(Math.pow(b,2)-4*a*c >0){
           System.out.println("Real and Distinct");
        }
        else if(Math.pow(b,2)-4*a*c ==0){
           System.out.println("Real and Equal");
        }
        else if(Math.pow(b,2)-4*a*c < 0){
            System.out.println("Imaginary");
            
        }
        if(Math.pow(b,2)-4*a*c >0 || Math.pow(b,2)-4*a*c ==0 ){
        double x=(-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
        double y=(-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
        System.out.print((int)x +" ");
        System.out.println((int)y);
        }

    }
}
