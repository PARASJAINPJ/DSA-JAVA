package ETEPRACTICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kthelementfromlast {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> li = new ArrayList<>();
		
		while(true){
		    int value = sc.nextInt();
		    li.add(value);
		    if(value==-1){
		        break;
		    }
		}
		int k = sc.nextInt();
		
		System.out.println(li.get(li.size()-k-1));
		
	}

    
}
