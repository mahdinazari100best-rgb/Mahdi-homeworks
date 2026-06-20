package cours.pkgclass;
 class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;
    
    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                numberOfStudents--;
                break;
            }
        }
    }
    
    public String[] getStudents() {
        return students;
    }
    
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming");
        Course course2 = new Course("Data Structures");
        
        course1.addStudent("Ali");
        course1.addStudent("Sara");
        course1.addStudent("Mohammad");
        
        course2.addStudent("Zahra");
        course2.addStudent("Hassan");
        
        System.out.println("Course: " + course1.getCourseName());
        System.out.println("Number of students: " + course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(course1.getStudents()[i]);
        }
    }
}