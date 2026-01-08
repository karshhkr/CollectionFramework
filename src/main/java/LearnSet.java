import java.util.HashSet;
import java.util.Set;

//In set it  follow the property which is no duplicate elements are allowed
//elements are not defined in order

public class LearnSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(118);
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
