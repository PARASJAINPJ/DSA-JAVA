
import java.util.*;
public class challengemaxfrequencycharacter {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String str= sc.next();
            int n = str.length();
            HashMap<Character, Integer> mp = new HashMap<>();
    
            for(char ch: str.toCharArray()){
                mp.put(ch, mp.getOrDefault(ch,0)+1);
            }
            int maxVal = 0;
            char maxChar='\0';
            for(Map.Entry<Character, Integer> entry : mp.entrySet()){
                char key = entry.getKey();
                int val = entry.getValue();
                if(val>maxVal){
                    maxVal = val;
                    maxChar = key;
                }
            }
    
            System.out.println(maxChar);
    
        }
}



