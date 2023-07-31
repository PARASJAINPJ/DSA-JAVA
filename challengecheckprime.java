import java.util.*;
public class challengecheckprime {
    public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=2;
		int count=0;
		while(i<n){
			if(n%i==0){
               count ++;
			}
			i++;
		}
		if(count<=2){
			System.out.print("Prime");
		}
		else{
			System.out.print("Not Prime");
		}


    }
}
