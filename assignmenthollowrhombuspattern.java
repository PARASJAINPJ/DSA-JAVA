
import java.util.Scanner;
public class assignmenthollowrhombuspattern {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=0;
		int i=0;
		int j=0;
		for(i=0;i<n;i++){
			for(sp=1;sp<n-i;sp++){
				System.out.print(" ");
			}
			if(i==0 || i==n-1){
				for(j=0;j<n;j++){
					System.out.print("*");
				}
			}
			else{
			for(j=0;j<n;j++){
				if(j==0 || j==n-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			}
			System.out.println();
		}

    }
}
