package backtracking;

public class permutations {
    public static void main(String[] args) {
        String str="abc";
        per(str,"");
    }
    public static void per(String str,String ans) {
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //abcde =>"ab"+"de"="abde"
            String newstr=str.substring(0, i)+str.substring(i+1);
            per(newstr,ans+curr);
        }
    }
    
}
