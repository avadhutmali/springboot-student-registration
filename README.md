
# 🎓 Student Course Registration System

A full-stack web application for managing student course registrations.

This project is built using:
- 🧠 **Spring Boot** (backend, using JDBC for database access)
- ⚛️ **React** (frontend, for interacting with the system)
- 🐬 **MySQL** (as the relational database)

---

## 📁 Project Structure

```
.
├── backend/        # Spring Boot backend (JDBC + REST API)
├── frontend/       # React frontend (student interface)
└── README.md
```

---

## 🔧 Backend Setup (Spring Boot + JDBC)

### 📦 Tech Stack:
- Spring Boot 3.5+
- JDBC Template (no JPA)
- MySQL
- Maven

### 📄 Prerequisites:
- Java 21+
- MySQL installed and running
- Maven

### ⚙️ Run the Backend:

1. Create database:

```sql
CREATE DATABASE studentdb;
```

2. Update `backend/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password
```

3. Run backend:

```bash
cd backend
./mvnw spring-boot:run
```

### ✅ Features:

- Admin can:
  - Add new students
  - Add new courses
  - Enroll students into courses
- Students can:
  - View their enrolled courses

---

## 🎨 Frontend Setup (React)

### ⚙️ Run the Frontend:

1. Navigate to `frontend/`:

```bash
cd frontend
```

2. Install dependencies:

```bash
npm install
```

3. Start the development server:

```bash
npm start
```

> The React app will run on [http://localhost:3000](http://localhost:3000)

---

## 🔗 API Endpoints

### 📚 Student

- `POST /api/student/add`  
- `GET /api/student/all`

### 📘 Course

- `POST /api/course/add`  
- `GET /api/course/all`

### 🔁 Enrollment

- `POST /api/enrollment/enroll?student_id=1&course_id=2`  
- `GET /api/enrollment/student/{id}` → list courses for student

---

## ⚠️ CORS Note

The backend allows CORS for React development. Configured in `CorsConfig.java`:

```java
registry.addMapping("/**").allowedOrigins("http://localhost:3000");
```

---

## 📌 Future Enhancements

- Add authentication (Spring Security / JWT)
- Role-based access (Admin vs Student)
- Improve frontend UI/UX
- Add search/filter for courses

---

## 🙌 Author

- [Your Name]  
- [Your GitHub Profile Link]

---

## 📃 License

This project is licensed under the MIT License. See `LICENSE` for details.
