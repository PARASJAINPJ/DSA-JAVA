import java.util.Scanner;
public class assignmentpatternmountain {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=0;
		int sp=0;
		int c=0;
		int t=0;
		for(i=1;i<=n;i++){
			c=n-1-i;
			t=i;
			for(j=1;j<=i;j++){
				System.out.print(j+"\t");
			}
			for(sp=1;sp<=n-i;sp++){
				System.out.print("\t");
			}
			while(c>0){
				System.out.print("\t");
				c--;
			}
			if(i==n){
				for(j=1;j<i;j++){
					System.out.print(t-1+"\t");
					t--;
				}
				t++;
			}
			else{
				for(j=1;j<=i;j++){
					System.out.print(t+"\t");
					t--;
				}
				t++;
			}
			System.out.println();
		}

    }
}