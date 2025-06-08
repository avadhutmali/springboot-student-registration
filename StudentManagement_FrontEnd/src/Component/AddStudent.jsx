import React, { useState } from 'react';
import { addStudent } from '../api/StudentApi.js';

function AddStudent() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [msg, setMsg] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await addStudent({ name, email });
      setMsg('Student added successfully!');
    } catch {
      setMsg('Error adding student.');
    }
  };

  return (
    <div>
      <h2>Add Student</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Student Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
        />
        <input
          type="email"
          placeholder="Student Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />
        <button type="submit">Add Student</button>
      </form>
      {msg && <p>{msg}</p>}
    </div>
  );
}

export default AddStudent;
