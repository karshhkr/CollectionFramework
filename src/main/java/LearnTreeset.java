import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeset {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        //have set property
        // implements on BST and sorted form
        //Elements are unique



        set.add(101);
        set.add(127);
        set.add(131);
        set.add(132);
        System.out.println(set);
        set.remove(118);
        System.out.println(set);


// contains :- what it do is check elements is present and return T/F
        System.out.println(set.contains(128));

        System.out.println(set.isEmpty());//check set is empty or not

        System.out.println(set.size());//to check size

        set.clear();// set:- its is used to remove the prev elements and doesnt add with new elements

    }
}
