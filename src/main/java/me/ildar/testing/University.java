package me.ildar.testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private Map<Integer, Student> allStudents = new HashMap<>();
    private int countId;

    public void addStudents(Student student) {
        if (allStudents == null) {
            allStudents = new HashMap<>();
        }
        student.setId(countId);
        allStudents.put(countId, student);
        countId++;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(allStudents.values());
    }

    public List<Student> getStudents(boolean isMale) {
        List<Student> listStudents = new ArrayList<>();
        for (Student student : allStudents.values()) {
            if (student.isMale() == isMale) {
                listStudents.add(student);
            }
        }
        return listStudents;
    }

}
