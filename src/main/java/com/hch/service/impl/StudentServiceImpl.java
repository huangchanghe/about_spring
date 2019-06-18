package com.hch.service.impl;

import com.hch.dao.StudenDao;
import com.hch.model.Student;
import com.hch.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudenDao studenDao;

    public void setStudenDao(StudenDao studenDao) {
        this.studenDao = studenDao;
    }

    @Override
    public int studentAdd(String name) {
        System.out.println("add the student "+name);
        return 0;
    }

    @Override
    public int addStudent(Student student) {

        return studenDao.addStudent(student);
    }

    @Override
    public int updateStudent(Student student) {

        return  studenDao.updateStudent(student);
    }

    @Override
    public int deleteStudent(int id) {

        return studenDao.deleteStudent(id);
    }

    @Override
    public List<Student> findStudents() {
        return studenDao.findStudents();
    }


}
