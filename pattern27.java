import java.util.Scanner;

public class pattern27 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int nst=1;
        int nsp=n-1;
        int val;
        int row=1;
        while(row<=n){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("\t");// (\t)) is used for spacing.it gives 4 spaces
                
            }
            val=1;
            for(int cst=1;cst<=nst;cst++){
                System.out.print(val+"\t");
                if(cst<=nst/2){
                val++;
                }else{
                    val--;
                }
            }
            
            System.out.println();
        
        nst=nst+2;
        nsp--;
        
        row++;
        }

        
    }
    
}
