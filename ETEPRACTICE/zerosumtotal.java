package ETEPRACTICE;
    import java.util.*;
import java.math.*;
public class zerosumtotal {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(sc.hasNext()){
            arr.add(sc.nextInt());
        }
        
        for(int i=0; i<arr.size(); i++){
            for(int j=i; j<arr.size(); j++){
                int sum = 0;
                ArrayList<Integer> brr=new ArrayList<Integer>();
                for(int k=i; k<=j; k++){
                    sum+=arr.get(k);
                    brr.add(arr.get(k));
                }
                if(sum==0){
                    System.out.print(brr);
                }
            }
        }



    }
}

    

