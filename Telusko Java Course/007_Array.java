class Student {
    int rollNo;
    String name;
    int marks;
}

class Array {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 21;
        s1.name = "Akash";
        s1.marks = 78;
    
        Student s2 = new Student();
        s2.rollNo = 14;
        s2.name = "Shruti";
        s2.marks = 94;

        Student s3 = new Student();
        s3.rollNo = 10;
        s3.name = "Disha";
        s3.marks = 95;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks);
        }
    }    
}
