// same as set just only random order elements will not be there
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        //in this LinkedlistHashset random order of elements will not be stored
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
