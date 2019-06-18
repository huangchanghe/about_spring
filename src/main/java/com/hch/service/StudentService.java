package com.hch.service;

import com.hch.model.Student;

import java.util.List;

public interface StudentService {
    public int studentAdd(String name);

    public int addStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudent(int id);
    public List<Student> findStudents();
}
