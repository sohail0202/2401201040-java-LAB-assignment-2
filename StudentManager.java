package studentmanagement.service;

import studentmanagement.model.Student;

public class StudentManager implements RecordActions {
    private Student[] students;
    private int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Student s) {
        if (count == students.length) {
            System.out.println("No space to add more students.");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (students[i].getRollNo() == s.getRollNo()) {
                System.out.println("Duplicate roll number not allowed.");
                return;
            }
        }

        students[count] = s;
        count++;
        System.out.println("Student added successfully.");
    }

    public void deleteStudent(int rollNo) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (students[i].getRollNo() == rollNo) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }

        students[count - 1] = null;
        count--;
        System.out.println("Student deleted successfully.");
    }

    public void updateStudent(int rollNo, double newMarks) {
        for (int i = 0; i < count; i++) {
            if (students[i].getRollNo() == rollNo) {
                students[i].setMarks(newMarks);
                System.out.println("Marks updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void viewAll() {
        if (count == 0) {
            System.out.println("No students found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }
}
