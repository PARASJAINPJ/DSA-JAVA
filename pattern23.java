import java.util.Scanner;

public class pattern23 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int nst=1;
        int nsp=n-1;
        int row=1;
        //int val=1;

        while(row<=n){
            for(int csp=1;csp<=nsp;csp++){
            System.out.print(" ");
        }
        for(int cst=1;cst<=nst;cst++){
            System.out.print("1");
        }
        System.out.println();
        nsp--;
        nst=nst+2;
        row++;

    }

    
}
}
