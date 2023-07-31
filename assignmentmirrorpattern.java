// import java.util.Scanner;
// public class assignmentmirrorpattern {
//     public static void main(String[]args){
//         Scanner scn=new Scanner(System.in);
//         int n= scn.nextInt();
//         int i;
//         int nsp=n/2;
//         int nst=1;
//         for(i=1;i<=n;i++){
//             for(int j=1;j<=nsp;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=nst;j++){

//                 System.out.print("*");
//             }
//             if(i<=(n/2)){
//                 nsp-- ;
//                 nst+=2;
//             }
//             else{
//                 nsp++;
//                 nst-=2;
//             }
//             System.out.println();
//         }

//     }
    
// }
import java.util.Scanner;
public class assignmentmirrorpattern {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int sp=0;
		int j=0;
		int temp=(n+1)/2;
		for(i=0;i<temp;i++){
			for(sp=1;sp<temp-i;sp++){
				System.out.print("\t");
			}
			for(j=0;j<=i;j++){
				System.out.print("*\t");
			}
			for(j=0;j<i;j++){
				System.out.print("*\t");
			}
			System.out.println();
		}
		for(i=temp-2;i>=0;i--){
			for(sp=1;sp<temp-i;sp++){
				System.out.print("\t");
			}
			for(j=0;j<=i;j++){
				System.out.print("*\t");
			}
			for(j=0;j<i;j++){
				System.out.print("*\t");
			}
			System.out.println();
		}
    }
}