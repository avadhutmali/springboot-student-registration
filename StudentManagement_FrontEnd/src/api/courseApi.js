import axios from 'axios';

const COURSE_BASE = 'http://localhost:8081/api/course';

export const addCourse = (course) => {
  return axios.post(`${COURSE_BASE}`, course);
};
