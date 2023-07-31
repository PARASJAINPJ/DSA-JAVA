
import java.util.Scanner;
public class assignmentpatternwithzeroes {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=0;
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				if(j==0 || j==i){
					System.out.print((i+1)+"\t");
				}
				else{
					System.out.print(0+"\t");
				}
			}
			System.out.println();
		}

    }
}
