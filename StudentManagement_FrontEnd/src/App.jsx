import React from 'react';
import EnrollForm from './Component/EnrollForm'
import StudentCourses from './Component/StudentCourses';
import AddStudent from './Component/AddStudent';
import AddCourse from './Component/AddCourse';

function App() {
  return (
    <div className="App">
      <h1>Student Course Registration System</h1>

      <AddStudent />
      <AddCourse />
      <EnrollForm />
      <StudentCourses />
    </div>
  );
}

export default App;
