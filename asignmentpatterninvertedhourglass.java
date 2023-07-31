
import java.util.*;
public class asignmentpatterninvertedhourglass {
    public static void main(String args[]) {
		
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int i=0;
			int j=0;
			int c=0;
			int sp=0;
			int k=n;
			int m=n;
			for(i=0;i<=n;i++){
				c=n-i-1;
				k=n;
				for(j=0;j<=i;j++){
					System.out.print(k+" ");
					k--;
				}
				for(sp=0;sp<n-i;sp++){
					System.out.print("  ");
				}
				while(c>0){
					System.out.print("  ");
					c--;
				}
				if(i==n){
					for(j=i-1;j>=0;j--){
						System.out.print(n-j+" ");
						m++;
					}
				}
				else{
				for(j=i;j>=0;j--){
					System.out.print(n-j+" ");
					m++;
				}
				}
				m=m-2;
				if(i>1){
					m--;
				}

				System.out.println();
			}
			for(i=n-1;i>=0;i--){
				c=n-1-i;
				k=n;
				for(j=0;j<=i;j++){
					System.out.print(k+" ");
					k--;
				}
				for(sp=0;sp<n-i;sp++){
					System.out.print("  ");
				}
				while(c>0){
					System.out.print("  ");
					c--;
				}
				if(i==n){
					for(j=i-1;j>=0;j--){
						System.out.print(n-j+" ");
					}
				}
				else{
					for(j=i;j>=0;j--){
						System.out.print(n-j+" ");
					}
				}
				System.out.println();

			}

		}
    
}
