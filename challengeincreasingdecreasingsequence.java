import java.util.Scanner;
public class challengeincreasingdecreasingsequence {
public static void main(String[] args) {
    public static boolean valid_invalid(int n){
    Scanner scn=new Scanner(System.in);
    int prev = scn.nextInt();
    int cnt = 1;
    boolean goingUp = false;
    boolean isValid = true;

    while(cnt < n){

        int curr = scn.nextInt();

        int diff = curr - prev;
         // As the sequence must be strctly decreasing or increasing
        if(diff == 0){  
            isValid = false;
        }else if(diff > 0){  // If Sequence is increasing 
            goingUp = true;
        }else if(goingUp && diff < 0){
          // If Sequence is Decreasing if its already increased once
                            isValid = false;
        }

        prev = curr;
        cnt++;

    }

    return isValid;
}

    
}
}
