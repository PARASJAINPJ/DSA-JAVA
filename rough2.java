// when end times are sorted
import java.util.ArrayList;

public class rough2 {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9};//end time basis sorted

        int maxact=0;
        ArrayList<Integer> ans=new ArrayList<>();

        //1st activity will be selected as it will have minimum time as end time sorted
        maxact=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>lastend){
                //activity select
                maxact++;
                ans.add(1);
                lastend=end[i];
            }
        }        
        System.out.println("Max Activities ="+ maxact);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    
}
