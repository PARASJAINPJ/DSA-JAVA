package ETEPRACTICE;
 import java.util.*;
public class ShortestStringAfterDeletion {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        List<Integer> li = new ArrayList();
        while(sc.hasNext()){
            li.add(sc.nextInt());
        }
        StringBuilder s=new StringBuilder(str);
        for(int i=0;i<li.size();i++) {
            s.insert(li.get(i)+i, "*");
            
        }

        
        System.out.println(s);
    }
}

    

