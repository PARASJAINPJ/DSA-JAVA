// import java.util.Scanner ;

// public class classrough{
 
 
// public static void main(String[] args)
// {
 
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter N : ");
// int n=sc.nextInt(); 
// // System.out.print("Enter Symbol : ");
 
// // char c = sc.next().charAt(0);
 
 
 
// for(int i=0;i<n;i++)
// {
// for(int j=0;j<n/2;j++)
 
// {
// if(j<n-i)
// System.out.print("*");
// else
 
// System.out.print(" ");
 
// }
// for(int j=0;j<n;j++)
 
// {
 
 
// if(j<i)
// System.out.print(" ");
// else
 
// System.out.print("*");
// }
 
 
// System.out.println();
 
// } // 
// for(int i=1;i<=n;i++)
// {
// for(int j=0;j<n;j++)
 
// {
// if(j<i)
// System.out.print("*");
// else
 
// System.out.print(" ");
 
// }
// for(int j=0;j<n;j++)
 
// {
 
 
// if(j<n-i)
// System.out.print(" ");
// else
 
// System.out.print("*");
// }
 
 
// System.out.println();
 
// } 
 
// }
// }
import java.util.Scanner;
public class classrough {
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
