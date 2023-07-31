 import java.util.Scanner;
 public class assignmentfibonaccipattern{
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int a=1;
		int b=1;
		int s=0;
		int j=0;
		for(i=0;i<n;i++){
			if(i==0){
				System.out.print(0+"\t");
			}
			else if(i==1){
				System.out.print(1+"\t"+1);
			}
			else{
			for(j=0;j<=i;j++){
				s=a+b;
				System.out.print(s+"\t");
				a=b;
				b=s;
			}
			}
			System.out.println();
		}

    }
}
