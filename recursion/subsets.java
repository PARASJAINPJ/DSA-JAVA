//print allsubsets of a set of first n natural numbers
package recursion;

import java.util.ArrayList;

public class subsets {
    public static void printsubsets(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print  (subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubsets(int n,ArrayList<Integer> subset){
        if(n==0){
            printsubsets(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findsubsets(n-1,subset);

        //add anhi hoga
        subset.remove(subset.size()-1);
        findsubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findsubsets(n, subset);
    }
    
}
