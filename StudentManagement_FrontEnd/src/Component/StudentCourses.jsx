import React, { useState } from 'react';
import { getCoursesByStudentId } from '../api/enrollmentApi';

function StudentCourses() {
  const [student_id, setstudent_id] = useState('');
  const [courses, setCourses] = useState([]);
  const [error, setError] = useState('');

  const fetchCourses = async () => {
    try {
      const res = await getCoursesByStudentId(student_id);
      setCourses(res.data);
      setError('');
    } catch {
      setError('No courses found or invalid student ID.');
      setCourses([]);
    }
  };

  return (
    <div>
      <h2>View Student Courses</h2>
      <input
        type="number"
        placeholder="Enter Student ID"
        value={student_id}
        onChange={(e) => setstudent_id(e.target.value)}
      />
      <button onClick={fetchCourses}>Fetch Courses</button>

      {error && <p>{error}</p>}
      {courses.length > 0 && (
        <ul>
          {courses.map((course) => (
            <li key={course.id}>
              {course.id} - {course.title}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default StudentCourses;
