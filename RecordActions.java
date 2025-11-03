package studentmanagement.service;

import studentmanagement.model.Student;

public interface RecordActions {
    void addStudent(Student s);
    void deleteStudent(int rollNo);
    void updateStudent(int rollNo, double newMarks);
    void viewAll();
}
