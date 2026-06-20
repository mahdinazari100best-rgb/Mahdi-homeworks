package thecourseclass;
import java.util.ArrayList;          

public class Course {               
    private String courseName;       
    private ArrayList<String> students = new ArrayList<>();  
    
    public Course(String courseName) {  
        this.courseName = courseName;   
    }
    
    public void addStudent(String student) {  
        students.add(student);                
    }
    
    public void dropStudent(String student) { 
        students.remove(student);             
    }
    
    public String[] getStudents() {           
        return students.toArray(new String[0]); 
    }
    
    public int getNumberOfStudents() {      
        return students.size();             
    }
}



