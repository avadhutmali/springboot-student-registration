CREATE TABLE Students(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR2(255) NOT NULL,
    email VARCHAR2(255) UNIQUE NOT NULL
);

CREATE TABLE Courses(
    courseId INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR2(255) NOT NULL,
    description TEXT
);

CREATE TABLE Enrollment(
    student_id INT,
    course_id INT,
    PRIMARY KEY(student_id,course_id),
    FOREIGN KEY(student_id) REFERENCES Students(student_id) ON DELETE CASCADE,
    FOREIGN KEY(course_id) REFERENCES Courses(course_id) ON DELETE CASCADE
);