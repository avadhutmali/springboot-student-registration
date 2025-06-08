CREATE TABLE IF NOT EXISTS Students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS Courses (
    courseId INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE IF NOT EXISTS Enrollment (
    student_id INT,
    course_id INT,
    PRIMARY KEY (student_id, course_id),
    CONSTRAINT fk_student FOREIGN KEY (student_id) REFERENCES Students(id) ON DELETE CASCADE,
    CONSTRAINT fk_course FOREIGN KEY (course_id) REFERENCES Courses(courseId) ON DELETE CASCADE
);
