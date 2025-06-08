package com.example.registration.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.registration.model.Enrollment;

@Repository
public class EnrollmentRepository {
    JdbcTemplate jdbc = new JdbcTemplate();

    public EnrollmentRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    RowMapper<Enrollment> mapper = new RowMapper<Enrollment>() {
        @Override
        public Enrollment mapRow(ResultSet rs,int rowNum)throws SQLException{
            Enrollment er = new Enrollment();
            er.setCourseId(rs.getInt("course_id"));
            er.setStudentId(rs.getInt("student_id"));
            return er;
        }
    };

    public int saveEnrollement(int student_id,int course_id){
        String SQL = "INSERT INTO Enrollment(student_id,course_id) values(?,?)";
        return jdbc.update(SQL, student_id,course_id);
    }

    public List<Integer> findCourseIdsByStudentId(int student_id){
        String SQL = "SELECT course_id FROM Enrollment WHERE student_id = ?";
        return jdbc.query(SQL, (rs,rowNum)->rs.getInt("course_id"),student_id);
    }

}
