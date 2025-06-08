import axios from 'axios';

const STUDENT_BASE = 'http://localhost:8081/api/student';

export const addStudent = (student) => {
  return axios.post(`http://localhost:8081/api/student`, student);
};
