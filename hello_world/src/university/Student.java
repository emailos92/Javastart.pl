package university;

public class Student {
    private String firstName;
    private String lastName;
    private String indexNumber;

    private static int studentsNumber = 0;

    public Student(String firstName, String lastName, String indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        studentsNumber++;
    }

    public static int getStudentNumber(){
        return studentsNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
