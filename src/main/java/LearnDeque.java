/*;👉Deque ek aisi queue hai jisme elements ko
👉 aage (front) se bhi aur peeche (rear) se bhi add/remove kar sakte ho*/
import java.util.ArrayDeque;
import java.util.Deque;
public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(131);//put elements in Array over the last

        adq.offer(318);
        adq.offerFirst(48);//put elements in Array head or starting postion
        adq.offer(345);
        System.out.println(adq);

//peek and poll fuction also is used
System.out.println(adq.peek());
System.out.println(adq.peekFirst());
System.out.println(adq.peekLast());

System.out.println(adq.poll());
System.out.println("poll"+adq);

System.out.println(adq.pollFirst());
System.out.println("pollFirst"+adq);

System.out.println(adq.pollLast());
System.out.println("pollLast"+adq);



    }

}
