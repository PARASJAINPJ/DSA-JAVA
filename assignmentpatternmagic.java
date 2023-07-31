
import java.util.Scanner;
public class assignmentpatternmagic  {
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int sp=0;
		int j=0;
		int c=0;
		for(i=0;i<n;i++){
			c=i-1;
			for(j=0;j<n-i;j++){
				System.out.print("*");
			}
			for(sp=0;sp<i;sp++){
				System.out.print(" ");
			}
			while(c>0){
				System.out.print(" ");
				c--;
			}
			if(i==0){
				for(j=0;j<n-i-1;j++){
					System.out.print("*");
				}
			}
			else{
				for(j=0;j<n-i;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(i=n-2;i>=0;i--){
			c=i-1;
			for(j=0;j<n-i;j++){
				System.out.print("*");
			}
			for(sp=0;sp<i;sp++){
				System.out.print(" ");
			}
			while(c>0){
				System.out.print(" ");
				c--;
			}
			if(i==0){
				for(j=0;j<n-1-i;j++){
					System.out.print("*");
				}
			}
			else{
				for(j=0;j<n-i;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
    }
}
