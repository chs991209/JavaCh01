package ch_04;

public class Student {
    public int studentID;
    public String studentName;
    public String studentaddress;

    public void showStudentInfo() {
        System.out.println( studentID + " Student's Name is " + studentName + "/n Address is " + studentaddress + ".");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
