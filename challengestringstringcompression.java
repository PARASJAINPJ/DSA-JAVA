import java.util.Scanner;
public class challengestringstringcompression {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String str=scn.nextLine();
        String ans="" + str.charAt(0);
        int count =1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i)){
                count++;
            }
            else{
                if(count>1){
                    ans+=count;
                }
                 count=1;
                 ans+=str.charAt(i);
                
                
            }
        }
        if(count>1){
            ans+=count;
        }
        System.out.println(ans);
    }
}
