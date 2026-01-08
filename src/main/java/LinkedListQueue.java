import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

       //offer is used to put elemets in queue

        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        System.out.println(queue);
        System.out.println(queue.offer(19));

//poll will remove element
        System.out.println(queue.poll());
        System.out.println(queue);

        //peek is  which element will be next
        System.out.println(queue.peek());

        //element() which iss next element which is gonna poll but through exceptions
        System.out.println(queue.element());




//        queue.add(1);
//        queue.add(2);
    }
}
