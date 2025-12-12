import java.util.*;

class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Array2 {
    public static void main(String args[]) {
        Student[] s = new Student[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter roll no and name of student " + (i + 1));
        }
    }
}
