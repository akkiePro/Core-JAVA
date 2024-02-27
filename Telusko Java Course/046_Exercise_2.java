import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Task: Sort Student's data based on their age.
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}
class Exercise2 {
    public static void main(String[] args) {
        Comparator<Student> comp = (i, j) ->  i.age > j.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();
         studs.add(new Student(21, "Akki"));
         studs.add(new Student(46, "Trilochan"));
         studs.add(new Student(19, "Shruti"));
         studs.add(new Student(23, "Akash"));
         studs.add(new Student(44, "Bhagvati"));
        
        Collections.sort(studs, comp);

        // System.out.println(studs);
        for (Student s : studs) 
            System.out.println(s.name + " : " + s.age);
        
    }
}