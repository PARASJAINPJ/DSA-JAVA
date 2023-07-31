import java.util.*;
public class challengebinarytodecimal {
     public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=0;
		double dec=0;
		while(n!=0){
			int rem=n%10;
			n=n/10;
		    dec = dec + rem*Math.pow(2,i);
			i++;
		}
		System.out.print((int)dec);

    }
}

