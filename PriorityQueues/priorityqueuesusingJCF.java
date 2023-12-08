package PriorityQueues;

import java.util.PriorityQueue;

public class priorityqueuesusingJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();//ascending order
        pq.add(3);//O(logn)
        pq.add(1);
        pq.add(9);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());//O(1)
            pq.remove();//o(logn)
        }
    }
    //for descending order initialise as
    //PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    
    
}
