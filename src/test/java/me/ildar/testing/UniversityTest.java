package me.ildar.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UniversityTest {
    private Student student1;
    private Student student2;
    private Student student3;
    private University university;

    @BeforeEach
    public void setUp() {
        student1 = new Student("Женя", 35, true);
        student2 = new Student("Алина", 34, false);
        student3 = new Student("Женя", 25, false);
        university = new University();
        university.addStudents(student1);
        university.addStudents(student2);
        university.addStudents(student3);

    }

    @Test
    public void getAllStudents() {
        List<Student> expected = university.getAllStudents();
        List<Student> actual = new ArrayList<>();

        actual.add(student1);
        actual.add(student2);
        actual.add(student3);

        assertEquals(expected, actual);
    }

    @Test
    public void getAllStudentsNotNull() {
        University university = new University();
        List<Student> expected = university.getAllStudents();

        assertNotNull(expected);
    }

    @Test
    public void getAllStudentsIsMale() {
        List<Student> expected = university.getStudents(true);

        List<Student> actual = new ArrayList<>();
        actual.add(student1);

        assertEquals(expected, actual);
    }
}
