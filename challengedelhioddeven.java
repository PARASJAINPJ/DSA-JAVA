import java.util.Scanner;

public class challengedelhioddeven{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        while(t!=0){
        int n=scn.nextInt();
        int sume=0;
        int sumo=0;
        
        while(n!=0){
        int rem= n%10;
        n=n/10;
        if(rem%2==0){
            sume=sume+rem;
        }
        else {
             sumo=sumo+rem;
        }

        }
        if(sume%4==0 || sumo%3==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        t--;
    }
    
}
}