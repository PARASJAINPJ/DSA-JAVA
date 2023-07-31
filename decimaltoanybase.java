import java.util.Scanner;

public class decimaltoanybase {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int snum=scn.nextInt();
        int db=scn.nextInt();
        // here db refers to destination base
        //snum refers to source number here
        int res=decimaltoanybase(snum,db);
        System.out.println(res);
    }
    public static int decimaltoanybase(int snum,int sb){
        int multiplier=1;
        int ans=0;
        while(snum!=0){
            int rem=snum % sb;
            ans=ans + (rem*multiplier);
            multiplier=multiplier*10;
            snum=snum/sb;
            
        }
        return ans;
    }
    
}
