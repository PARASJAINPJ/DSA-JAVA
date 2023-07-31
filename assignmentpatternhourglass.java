
import java.util.*;
public class assignmentpatternhourglass {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=0;
		int k=0;
		int sp=0;
		for(i=0;i<=n;i++){
			k=1;
			for(sp=1;sp<=i;sp++){
				System.out.print("  ");
			}
			for(j=n-i;j>=0;j--){
				System.out.print(j+" ");
			}
			for(j=n-i;j>0;j--){
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		for(i=n-1;i>=0;i--){
			k=1;
			for(sp=1;sp<=i;sp++){
				System.out.print("  ");
			}
			for(j=n-i;j>=0;j--){
				System.out.print(j+" ");
			}
			for(j=n-i;j>0;j--){
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
    }
}
