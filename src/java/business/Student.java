package business;

/*This is Student*/
public class Student {
    int studentId;
    String studentName;
    

    public Student() {
    }

    
/*Contruct*/
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        
    }
/*Get and Set*/
    
    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
