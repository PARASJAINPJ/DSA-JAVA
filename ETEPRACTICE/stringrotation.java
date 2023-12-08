package ETEPRACTICE;
 import java.util.Scanner;

public class stringrotation {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();
        
        if(n>s.length()){
            System.out.println(-1);
        }
        else{
            for(int i=n; i<n+s.length(); i++){
                System.out.print(s.charAt(i%s.length()));
            }
            
            System.out.println();
            for(int i=n+s.length()-1; i>=n; i--){
                System.out.print(s.charAt(i%s.length()));
            }
        }
        
        
    }
}

    

