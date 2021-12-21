package ch_04;

// studentKim print line >> ch_04.Student@4e04a765
// >>클래스에 자리잡은 인스턴스가 할당된 heap memory의  Virtual Address 주소
// studentKim >> 참조변수
public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.studentaddress = "Seoul Seocho";

        studentLee.showStudentInfo();


        Student studentKim = new Student();

        studentKim.studentID = 12346;
        studentKim.setStudentName("Kim");
        studentKim.studentaddress = "Seoul Seongsu";

        studentKim.showStudentInfo();
        System.out.println(studentKim);
        System.out.println(studentLee);
    }
}
