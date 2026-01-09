
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Student {
    String name;
    int rollNo;

public  Student(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
// equals() :- comaprasion that both objets values are equal or not and return T/F nad doesn't add in hashset
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }
//hashCode() :-
    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}