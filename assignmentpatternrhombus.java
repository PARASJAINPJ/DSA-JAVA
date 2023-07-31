 
import java.util.Scanner;
public class assignmentpatternrhombus{
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=0;
		int sp=0;
		int k=1;
		for(i=0;i<n;i++){
			for(sp=1;sp<n-i;sp++){
				System.out.print("\t");
			}
			for(j=0;j<=i;j++){
				System.out.print(k+"\t");
				k++;
			}
			k--;
			if(i!=0){
				k--;
			}
			for(j=0;j<i;j++){
				System.out.print(k+"\t");
				k--;
			}
			k++;
			if(i!=0){
				k++;
			}
			System.out.println();
		}
		k=n-1;
		for(i=0;i<n-1;i++){
			for(sp=0;sp<=i;sp++){
				System.out.print("\t");
			}
			for(j=0;j<n-i-1;j++){
				System.out.print(k+"\t");
				k++;
			}
			k--;
			
				k--;
			
			for(j=0;j<n-i-2;j++){
				System.out.print(k+"\t");
				k--;
			}
			System.out.println();
		}
    }
}
