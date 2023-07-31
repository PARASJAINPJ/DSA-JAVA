import java.util.Scanner;
public class assignmenthollowdiamondpattern {
      public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=0;
		int sp=0;
		int c=0;
		int temp=(n+1)/2;
		for(i=0;i<temp;i++){
			c=i;
			for(j=0;j<temp-i;j++){
				System.out.print("*\t");
			}
			for(sp=0;sp<i-1;sp++){
				System.out.print("\t");
			}
			while(c>0){
				System.out.print("\t");
				c--;
			}
			if(i==0){
				for(j=0;j<temp-i-1;j++){
					System.out.print("*\t");
				}
			}
			else{
				for(j=0;j<temp-i;j++){
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
		for(i=temp-2;i>=0;i--){
			c=i;
			for(j=0;j<temp-i;j++){
				System.out.print("*\t");
			}
			for(sp=0;sp<i-1;sp++){
				System.out.print("\t");
			}
			while(c>0){
				System.out.print("\t");
				c--;
			}
			if(i==0){
				for(j=0;j<temp-i-1;j++){
					System.out.print("*\t");
				}
			}
			else{
				for(j=0;j<temp-i;j++){
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
		
    }
}