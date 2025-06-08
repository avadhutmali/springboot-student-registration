import React, { useState } from 'react';
import { addCourse } from '../api/courseApi';

function AddCourse() {
  const [title, setName] = useState('');
  const [description, setDescription] = useState('');
  const [msg, setMsg] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await addCourse({ title, description });
      setMsg('Course added successfully!');
    } catch {
      setMsg('Error adding course.');
    }
  };

  return (
    <div>
      <h2>Add Course</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Course Name"
          value={title}
          onChange={(e) => setName(e.target.value)}
          required
        />
        <input
          type="text"
          placeholder="Course Description"
          value={description}
          onChange={(e) => setDescription(e.target.value)}
          required
        />
        <button type="submit">Add Course</button>
      </form>
      {msg && <p>{msg}</p>}
    </div>
  );
}

export default AddCourse;
