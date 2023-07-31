import java.util.Scanner;
public class assignmentpatternnumberladder {
    
        public static void main(String args[]) {
            // Your Code Here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=1;
            int i=0;
            int j=0;
            for(i=0;i<n;i++){
                for(j=0;j<=i;j++){
                    System.out.print(k+"\t");
                    k++;
                }
                System.out.println();
            }
        
    }
    
}
