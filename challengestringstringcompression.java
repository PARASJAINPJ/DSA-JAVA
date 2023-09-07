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
// class Solution {
//     public int compress(char[] chars) {
//       String newstr="";
//       for(int i=0;i<str.length();i++){
//           Integer count=1;
//           while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//               count++;
//               i++;
//           }
//           newstr+=str.charAt(i);
//           if(count>1){
//               newstr+=count.toString();
//           }
//       } 
//       return newstr; 
//     }
// }