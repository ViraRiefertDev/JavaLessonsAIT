package homework.homework32.task05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class Task05Test {
    HashSet<Student>students;
    Task05 task05;
    HashSet<Student> studentsWithBestNotes;

    Student student = new Student("Alex",88,1);
    Student student1 = new Student("Vasilij", 56,2);
    Student student2 = new Student("Katja", 90,3);
    Student student3 = new Student("Misha", 75, 4);
    Student student4 = new Student("Lena", 74,5);
    @BeforeEach

    void setUp(){
        students = new HashSet<>();
        studentsWithBestNotes= new HashSet<>();
        task05 = new Task05();
    }

    @Test
    void highGradesFilterWithSomeStudentsWithBestNotesTest() {
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        studentsWithBestNotes.add(student);
        studentsWithBestNotes.add(student2);
        studentsWithBestNotes.add(student3);
        assertEquals(studentsWithBestNotes, task05.highGradesFilter(students));
    }

    @Test
    void highGradesFilterWithNoStudentsWithBestNotesTest(){
        students.add(student1);
        students.add(student4);
        assertEquals(studentsWithBestNotes,task05.highGradesFilter(students));

    }

    @Test
    void highGradesFilterWithEmptyHashSet(){
        assertEquals(studentsWithBestNotes,task05.highGradesFilter(students));
    }

    @Test
    void highGradesFilterWithAllStudentsWithBestNotesTest(){
        students.add(student);
        students.add(student2);
        students.add(student3);

        studentsWithBestNotes.add(student);
        studentsWithBestNotes.add(student2);
        studentsWithBestNotes.add(student3);

        assertEquals(studentsWithBestNotes,task05.highGradesFilter(students));

    }

}