package greedyalgorithms;
//when end time is not sorted
import java.util.*;
public class activityselection2 {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,8,9};

        int maxact=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //sorting
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lambda function(shurt form) this function is made here to sort end time in 2-d array activities
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        //1st activity
        maxact=1;
        ans.add(activities[0][0]);
        int lastend=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastend){
                //activities select
                maxact++;
                ans.add(activities[i][0]);
                lastend=activities[i][2];
            }
        }
        System.out.println("Max Activities ="+ maxact);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
       


    }
}
