package com.example.registration.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.registration.model.Student;

@Repository
public class StudentRepository {
    private JdbcTemplate jdbc;

    public StudentRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    RowMapper<Student> mapper = new RowMapper<Student>() {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
            Student st = new Student();
            st.setId(rs.getInt("id"));
            st.setEmail(rs.getString("email"));
            st.setName(rs.getString("name"));
            return st;
        }
    };

    public int saveStudent(Student student){
        String sql = "INSERT INTO Students (name,email) values(?,?)";
        return jdbc.update(sql, student.getName(),student.getEmail());
    }

    public List<Student> getAllStudent(){
        String SQL = "SELECT * FROM Students";
        return jdbc.query(SQL, mapper);
    }

    public Student getStudentById(int id){
        String SQL = "SELECT * FROM Students WHERE id = ?";
        return jdbc.queryForObject(SQL, new Object[]{id},mapper);
    }
}
