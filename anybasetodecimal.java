import java.util.Scanner;

public class anybasetodecimal { 
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int snum=scn.nextInt();
        int sb=scn.nextInt();
        int res=anybasetodecimal(snum,sb);
        System.out.println(res);
    }
    public static int anybasetodecimal(int snum,int sb){
        int ans=0;
        int multiplier=1;
        while(snum!=0){
            int rem=snum%10;
            ans=ans + (rem*multiplier);
           // System.out.println(ans);
            
            multiplier=multiplier*sb;
            snum=snum/10;
        }
        return ans;
    
}
}
