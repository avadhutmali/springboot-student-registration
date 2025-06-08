
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
cd StudentManagement_Backend
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

1. Navigate to `StudentManagement_FrontEnd/`:

```bash
cd StudentManagement_FrontEnd
```

2. Install dependencies:

```bash
npm install
```

3. Start the development server:

```bash
npm run dev
```

> The React app will run on [http://localhost:5173](http://localhost:5173)

---

## 🔗 API Endpoints

### 📚 Student

- `POST /api/student`  
- `GET /api/student`

### 📘 Course

- `POST /api/course`  
- `GET /api/course`

### 🔁 Enrollment

- `POST /api/enrollment/?student_id=1&course_id=2`  
- `GET /api/enrollment/student/{id}` → list courses for student

---

## 📌 Future Enhancements

- Add authentication (Spring Security / JWT)
- Role-based access (Admin vs Student)
- Improve frontend UI/UX
- Add search/filter for courses

---

## 🙌 Author

- [Avadhut Mali](https://github.com/avadhutmali)

---

## 📃 License

This project is licensed under the MIT License. See `LICENSE` for details.
