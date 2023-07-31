import java.util.*;
public class temp {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = "" + s.charAt(0);
        int count = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
            }
            else{
				if(count>1){
					ans+=count;
				}
				count=1;
				ans+= s.charAt(i);
            }
        }
		if(count>1){
			ans+=count;
		}
        System.out.println(ans);
    }
}