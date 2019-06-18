package com.hch.dao;

import com.hch.model.Student;

import java.util.List;

public interface StudenDao {
    public int addStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudent(int id);
    public List<Student> findStudents();
}
