import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  //comapator is just making it maxheap

        //queue function will be there in priorityqueue too

        pq.offer(12);
        pq.offer(125);
        pq.offer(44);
        pq.offer(49);



        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}