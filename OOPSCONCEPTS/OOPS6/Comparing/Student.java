package OOPSCONCEPTS.OOPS6.Comparing;

class Student implements Comparable<Student> {
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = this.marks - o.marks;
        return diff;
    }
    // diff = 0 both equal
    // dif>0 this is biggger
    // diff<0 o is bigger
}