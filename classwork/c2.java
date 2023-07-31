package classwork;

import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int row=0;
        int nst=1;
        int nsp=n-1;
        int val=1;
        while(row<n){
            //spaces
            for(int csp=0;csp<nsp;csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst=0;cst<nst;cst++){
                System.out.print(val);
                if(cst<nst/2){
                    val++;
                }
                else{
                    val--;
                }
            }
            val=1;
            System.out.println();
            nsp--;
            row++;
            nst+=2;
            
        }
    }
}
