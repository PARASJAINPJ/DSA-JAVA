package ETEPRACTICE;

import java.util.*;

public class tripletLinkedList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        LinkedList<Integer> list1=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        LinkedList<Integer> list3=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n1;i++){
            int a=sc.nextInt();
            list1.add(a);
            list.add(a);
        }
        for(int i=0;i<n2;i++){
            int a=sc.nextInt();
            list2.add(a);
            list.add(a);
        }
        for(int i=0;i<n3;i++){
            int a=sc.nextInt();
            list3.add(a);
            list.add(a);
        }
        int target=sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                for(int k=0;k<list3.size();k++){
                    if(list1.get(i)+list2.get(j)+list3.get(k)==target){
                        set.add(list1.get(i));
                        set.add(list2.get(j));
                        set.add(list3.get(k));
                        break;
                    }
                }
            }
        }
        System.out.println(set);
    }
}