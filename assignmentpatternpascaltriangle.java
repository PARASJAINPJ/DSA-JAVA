
import java.util.Scanner;
public class assignmentpatternpascaltriangle {
	public static int fact(int n){
		if(n==0 || n==1){
			return 1;
		}
		return n*fact(n-1);
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=0;
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				int x=fact(i)/(fact(j)*fact(i-j));
				System.out.print(x+"\t");

			}
			System.out.println();
		}
    }
}