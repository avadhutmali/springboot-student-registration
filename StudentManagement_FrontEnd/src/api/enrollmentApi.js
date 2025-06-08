import axios from 'axios';

const BASE_URL = 'http://localhost:8081/api/enrollement';

export const enrollStudent = (student_id, course_id) => {
  return axios.post(`${BASE_URL}`, null, {
    params: { student_id, course_id }
  });
};

export const getCoursesByStudentId = (student_id) => {
  return axios.get(`${BASE_URL}/student/${student_id}`);
};
