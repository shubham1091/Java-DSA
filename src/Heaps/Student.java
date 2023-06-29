package Heaps;

public class Student implements Comparable<Student> {
    int rank;
    String name;

    public Student(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    @Override
    public int compareTo(Student s2) {
        // TODO Auto-generated method stub
        return this.rank - s2.rank;
    }

}
