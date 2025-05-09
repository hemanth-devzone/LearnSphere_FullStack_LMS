# Learn-Sphere: E-Learning Platform

## Project Overview

**Learn-Sphere** is a full-stack e-learning platform developed using Spring Boot and modern web technologies. This platform provides an interactive and user-friendly experience for both students and trainers. The project leverages Spring Boot for backend development and Thymeleaf with Bootstrap for the frontend. It offers various educational features such as user registration, course management, and secure payment integration.

### Key Features

- **User Authentication:**  
  Users can create accounts, log in, and maintain their profiles.  
  _Roles:_ Students and Trainers.
  
- **Course Management:**  
  Trainers can create and manage courses with multiple lessons, while students can browse and purchase available courses.

- **Lesson Management:**  
  Trainers can add detailed lessons to courses with topics and learning materials.

- **Payment Integration:**  
  Secure payment processing using Razorpay for course purchases.

- **Responsive Interface:**  
  The platform features a simple, responsive, and intuitive design for both web and mobile devices.

---

## Tech Stack

- **Frontend:**  
  <img alt="HTML5" src="https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white"/>
  <img alt="CSS3" src="https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white"/>
  <img alt="Bootstrap" src="https://img.shields.io/badge/bootstrap-%23563D7C.svg?style=for-the-badge&logo=bootstrap&logoColor=white"/>
  <img alt="Thymeleaf" src="https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white"/>

- **Backend:**  
  <img alt="Java" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"/>
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring%20Boot-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white"/>
  <img alt="Spring Data JPA" src="https://img.shields.io/badge/Spring%20Data%20JPA-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white"/>

- **Database:**  
  <img alt="MySQL" src="https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white"/>
---

## Project Structure

### 1. **Backend Components**

- **Controllers:**  
  Handle HTTP requests and manage application flow using Spring MVC.

- **Services:**  
  Implement business logic and transaction management.

- **Repositories:**  
  Manage data persistence using Spring Data JPA.

- **Entities:**  
  JPA entities for Users, Courses, and Lessons.

### 2. **Frontend Components**

  - **Thymeleaf Templates:**  
  Dynamic HTML templates with Bootstrap styling.

  - **Static Resources:**  
  CSS, JavaScript, and other static assets.

---

## Setup and Installation

### Prerequisites

- JDK 1.8 or later
- MySQL Database
- Maven
- IDE (IntelliJ IDEA, Eclipse, etc.)

### Steps to Run the Project

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/hemanth-devzone/LearnSphere_FullStack_LMS.git
2. **Import into IDE:**

    Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. **Database Configuration:**

    - Create MySQL database named 'ls3'
    - Update `application.properties` with your MySQL credentials:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost/ls3
      spring.datasource.username=your_username
      spring.datasource.password=your_password

4. **Run the Server:**

    ```bash
    cd com.learnSphere
    .\mvnw.cmd clean install
    .\mvnw.cmd spring-boot:run

5. **Access the Application:**

    Open a browser and go to http://localhost:9996/Learn-Sphere to start using the platform.
---

## Screenshots
**Home Page**
<img alt="Home page" src="https://github.com/user-attachments/assets/07932f3f-96c9-4797-bd19-6d38447bf578"/>
**Registration Page**
<img alt="Registration Page" src="https://github.com/user-attachments/assets/2f4fa39e-7a92-452b-bb2b-c27b68001e14"/>
**Login Page**
<img alt="Login Page" src="https://github.com/user-attachments/assets/5be342eb-a180-463a-9940-57d59c4a3aff"/>
**Trainer login Page**
<img alt="Trainer login page" src="https://github.com/user-attachments/assets/d2536208-3e5c-4611-8be4-b99b8debb461"/>
**Student Login Page**
<img alt="Student login page" src="https://github.com/user-attachments/assets/f39d96e8-6057-4c44-b28e-94b4132f592c"/>
**Course Purchase Page**
<img alt="Student login page" src="https://github.com/user-attachments/assets/8d9864fa-55e7-4ae6-b096-c20fa00d5361"/>
**Course Info Page**
<img alt="Course Info page" src="https://github.com/user-attachments/assets/dc22040b-fff7-4ebd-bea8-e7c877bb01ff"/>



---
## License
This project is licensed under the MIT License - see the LICENSE file for details.

---

## Acknowledgements

- Developed during internship at KodNest.
- Thanks to Spring Boot and Thymeleaf communities.
- Razorpay for providing secure payment integration.
- All contributors and mentors involved in the project journey.
