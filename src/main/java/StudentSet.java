import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student("karshkr",2));
        studentSet.add(new Student("utkarshkr",3));
        studentSet.add(new Student("kiwi",2));
        System.out.println(studentSet);

        Student s1=new Student("mohit",2);
        Student s2=new Student("Rohit",2);
        System.out.println(s1.equals(s2));
    }
}
