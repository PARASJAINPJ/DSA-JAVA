import static  java.lang.Math.min;
import java.util.Scanner;
public class challengehelpramu {
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       int t=scn.nextInt();//no. of test cases
       int []rick=new int[1005];int cab[]=new int[1005];
       while(t!=0){
        //costs of 4 types of tickets
       int c1=scn.nextInt();
       int c2=scn.nextInt();
       int c3=scn.nextInt();
       int c4=scn.nextInt();
       //no. of rickshaws and cabs
       int n=scn.nextInt();
       int m=scn.nextInt();
       //no. of rides of ech rickshaw
       for(int i=0;i<n;i++){
          rick[i]=scn.nextInt();
       }
       //no. of rides for each cab
       for(int i=0;i<m;i++){
        cab[i]=scn.nextInt();
       }
       //cost for rickshaws
       int rickcost=0;
       for(int i=0;i<m;i++){
        rickcost+=min(c1*rick[i],c2);
       }
       //cost for cabs
       rickcost=min(rickcost,c3);
       int cabcost=0;
       for(int i=0;i<m;i++){
        cabcost+=min(c1*cab[i],c2);
       }
       cabcost=min(cabcost,c3);

       //final cost for both rickshaws and cabs
       int finalcost=min(c4,rickcost+cabcost);
       System.out.println(finalcost);
       t--;
    }
    
}
}
