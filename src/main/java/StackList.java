import java.util.Stack;

public class StackList {
     public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();
         stack.push(1);
         stack.push(2);
         stack.push(3);
         stack.push(4);

         System.out.println(stack);

         System.out.println(stack.peek());// it helps to check which element is on the stack top


     stack.pop();// top element will be pop or remove from the list

         System.out.println(stack);
         System.out.println(stack.peek());
     }
}

