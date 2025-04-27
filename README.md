# Learn-Sphere: E-Learning Platform

## Project Overview

**Learn-Sphere** is a full-stack e-learning platform developed using Java, HTML, and CSS. This platform aims to provide an interactive and user-friendly experience for both learners and instructors. The project leverages Java for the backend development and HTML, CSS for the frontend. It offers various educational features such as user registration, course listings, and progress tracking.

### Key Features

- **User Authentication:**  
  Users can create accounts, log in, and maintain their profiles.  
  _Roles:_ Students and Instructors.
  
- **Course Management:**  
  Instructors can upload and manage their courses, while students can browse and enroll in available courses.

- **Progress Tracking:**  
  Students can track their learning progress and see how much content they've completed.

- **Admin Panel:**  
  Admins have full control to manage users and courses, ensuring proper maintenance of the platform.

- **Responsive Interface:**  
  The platform features a simple, responsive, and intuitive design for both web and mobile devices.

---

## Tech Stack

- **Frontend:**  
  <img alt="HTML5" src="https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white"/>
  <img alt="CSS3" src="https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white"/> 

- **Backend:**  
  <img alt="Java" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"/>
  <img alt="Spring" src ="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white"/>

- **Database:**  
  <img alt="MySQL" src="https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white"/>
---

## Project Structure

### 1. **Frontend (HTML & CSS)**

  The frontend is built using simple HTML and CSS files to create the structure and styling for the platform. The interface is designed to be minimalistic and easy to navigate.

### 2. **Backend (Java)**

- **Servlets & JSP:**  
    Java Servlets handle HTTP requests, while JSP (JavaServer Pages) render dynamic content, allowing user interactions to be processed and displayed on the web pages.

- **JDBC:**  
    Java Database Connectivity (JDBC) is used to interact with the MySQL database, allowing CRUD (Create, Read, Update, Delete) operations for users, courses, and progress tracking.

- **Controller:**  
    The backend uses the Model-View-Controller (MVC) architecture for separating the logic and ensuring scalability.

---

## Setup and Installation

### Prerequisites

- JDK 1.8 or later
- Apache Tomcat or any Java-based server
- MySQL Database
- IDE (IntelliJ IDEA, Eclipse, etc.)

### Steps to Run the Project

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/hemanthreddy100/Learn-Sphere.git
2. **Import into IDE:**

    Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. **Database Configuration:**

    Set up a MySQL database and import the required schema (you can find SQL files in the repository for setting up the database).

    Update the database.properties file with your database credentials.

4. **Run the Server:**

    Start your Apache Tomcat or Java-based server.

    Run the project as a Web Application.

5. **Access the Application:**

    Open a browser and go to http://localhost:8080/Learn-Sphere to start using the platform.
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
Thanks to all contributors for helping in the development of this platform.

Special thanks to the open-source community for providing tools and libraries used in this project.
