package the.course.pkgclass;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            students = Arrays.copyOf(students, students.length * 2);
        }
        students[numberOfStudents++] = student;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                students[i] = students[numberOfStudents - 1];
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    public String[] getStudents() {
        return Arrays.copyOf(students, numberOfStudents);
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void clear() {
        students = new String[1];
        numberOfStudents = 0;
    }

    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        
        course.addStudent("Ali");
        course.addStudent("Sara");
        course.addStudent("Reza");
        course.addStudent("Mina");
        course.addStudent("Ahmad");
        
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Number of students: " + course.getNumberOfStudents());
        System.out.println("Students list:");
        for (String s : course.getStudents()) {
            System.out.println("  - " + s);
        }
        
        System.out.println("\nDropping 'Sara'...");
        course.dropStudent("Sara");
        
        System.out.println("After dropping:");
        System.out.println("Number of students: " + course.getNumberOfStudents());
        for (String s : course.getStudents()) {
            System.out.println("  - " + s);
        }
        
        System.out.println("\nClearing all students...");
        course.clear();
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
}