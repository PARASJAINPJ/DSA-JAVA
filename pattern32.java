import java.util.Scanner;

public class pattern32 {

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int nr=(2*n) -1;
        int nst=1;
        int val;

        int row=1;
        while (row<=nr){
            if(row<=n){
                val=row;
            }else{
                val=nr-row+1;
            }
            int cst=1;
            while(cst<=nst){
                if(cst%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(val);
                }
                cst++;
            }
        
            System.out.println();
            if(row<=nr/2){
                nst+=2;
            }else{
                nst-=2;
            }
        row++;
    }
    
}
}
