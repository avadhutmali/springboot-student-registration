import React, { useState } from 'react';
import { enrollStudent } from '../api/enrollmentApi';

function EnrollForm() {
  const [student_id, setstudent_id] = useState('');
  const [course_id, setcourse_id] = useState('');
  const [message, setMessage] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await enrollStudent(student_id, course_id);
      setMessage(`Student ${student_id} enrolled in Course ${course_id}`);
    } catch (error) {
      setMessage('Error enrolling student.');
    }
  };

  return (
    <div>
      <h2>Enroll Student</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Student ID"
          value={student_id}
          onChange={(e) => setstudent_id(e.target.value)}
          required
        />
        <input
          type="number"
          placeholder="Course ID"
          value={course_id}
          onChange={(e) => setcourse_id(e.target.value)}
          required
        />
        <button type="submit">Enroll</button>
      </form>
      {message && <p>{message}</p>}
    </div>
  );
}

export default EnrollForm;
