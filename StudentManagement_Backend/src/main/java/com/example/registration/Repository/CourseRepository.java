package com.example.registration.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.registration.model.Course;
import com.example.registration.model.Student;

@Repository
public class CourseRepository {
    private JdbcTemplate jdbc;

    public CourseRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    RowMapper<Course> mapper = new RowMapper<Course>() {
        @Override
        public Course mapRow(ResultSet rs,int RowNum)throws SQLException{
            Course cs = new Course();
            cs.setId(rs.getInt("courseId"));
            cs.setTitle(rs.getString("title"));
            cs.setDescription(rs.getString("description"));
            return cs;
        }
    };

    public int addCourse(Course course){
        String SQL = "INSERT INTO Courses(title,description) values(?,?)";
        return jdbc.update(SQL, course.getTitle(),course.getDescription());
    }

    public List<Course> getAllCourses(){
        String SQL = "SELECT * FROM Courses";
        return jdbc.query(SQL, mapper);
    }

    public Course getCourseById(int id){
        String SQL = "SELECT * FROM Courses WHERE courseId = ?";
        return jdbc.queryForObject(SQL,new Object[]{id} ,mapper);
    }
}
