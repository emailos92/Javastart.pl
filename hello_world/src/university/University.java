package university;

public class University {
    public static void main(String[] args) {
        Student [] students = new Student[10];

        System.out.println(Student.getStudentNumber());
        students[0] = new Student("Emil","Arkita", "123");
        System.out.println(Student.getStudentNumber());
        students[1] = new Student("Dawid","Arkita", "456");
        System.out.println(Student.getStudentNumber());
    }
}
