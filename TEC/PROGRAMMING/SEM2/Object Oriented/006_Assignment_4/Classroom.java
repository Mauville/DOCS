import java.util.ArrayList;

public class Classroom{
    int cap = 10;
    String subj;
    ArrayList <Student> students = new ArrayList <Student> ();
    int studcount;
        
    public void addStudent(Student studentss) throws IndexOutOfBoundsException { 
        if (this.studcount == this.cap)
            throw new IndexOutOfBoundsException("Student Limit Exceeded");

        else{
        this.students.add(studentss);
        this.studcount ++;
        }
    }
    public int Adults (){
        int adcount = 0;
        for (Student currstd : students){
            if (currstd.getAge()<= 18)
                adcount ++;
        }
        return adcount;
    }


}
