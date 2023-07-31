
import java.util.Scanner;
public class assignmentpatterndoublesidedarrow {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int t=0;
		int j=0;
		int sp=0;
		int temp=(n+1)/2;
		int q=0;
		int c=0;
		for(i=1;i<=temp;i++){
			t=i;
			c=i-2;
			q=temp-i;
			for(sp=1;sp<=2*q;sp++){
				System.out.print("  ");
			}
			for(j=1;j<=i;j++){
				System.out.print(t+" ");
				t--;
			}
			for(sp=1;sp<=i-1;sp++){
				System.out.print("  ");
			}
			while(c>0){
				System.out.print("  ");
				c--;
			}
			if(i!=1){
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			}
			System.out.println();
		}
		for(i=temp-1;i>=1;i--){
			t=i;
			c=i-2;
			q=temp-i;
			for(sp=1;sp<=2*q;sp++){
				System.out.print("  ");
			}
			for(j=1;j<=i;j++){
				System.out.print(t+" ");
				t--;
			}
			for(sp=1;sp<=i-1;sp++){
				System.out.print("  ");
			}
			while(c>0){
				System.out.print("  ");
				c--;
			}
			if(i!=1){
				for(j=1;j<=i;j++){
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
    }
}