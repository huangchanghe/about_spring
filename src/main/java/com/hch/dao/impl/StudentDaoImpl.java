package com.hch.dao.impl;

import com.hch.dao.StudenDao;
import com.hch.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudenDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addStudent(Student student) {
        String sql="insert into student values (null ,?,?)";
        Object[] params=new Object[]{student.getName(),student.getAge()};
        return jdbcTemplate.update(sql,params);
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }

    @Override
    public int deleteStudent(int id) {
        return 0;
    }

    @Override
    public List<Student> findStudents() {
         String sql="select * from student ";
        final List<Student> students=new ArrayList<>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                Student student=new Student();
                student.setName(rs.getString("name"));
                student.setId(rs.getInt("id"));
                student.setAge(rs.getInt("age"));
                students.add(student);
            }
        });
        return students;
    }
}
