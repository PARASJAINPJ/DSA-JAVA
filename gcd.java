import java.util.Scanner;

public class gcd {
    public static void main(String[]args){
      Scanner scn=new Scanner(System.in);
      int divident=scn.nextInt();
      int divisor=scn.nextInt();
       while(divident%divisor!=0){
        int rem=divident%divisor;
        System.out.println(rem);
        divident=divisor;
        divisor=rem;
       }
       System.out.println(divisor);
    
}
}