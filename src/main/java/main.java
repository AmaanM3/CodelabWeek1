
import app.config.HibernateConfig;
import app.dao.CourseDAO;
import app.dao.PersonDAO;
import app.dao.StudentDAO;
import entities.Course;
import entities.Person;
import entities.Student;
import entities.StudentStatus;
import jakarta.persistence.EntityManagerFactory;

import java.time.LocalDate;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        // Person
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();
        PersonDAO personDAO = new PersonDAO(emf);
        Person person = new Person("Amaan", 23);
        Person savedPerson = personDAO.createPerson(person);
        System.out.println(savedPerson);

        // Student
        StudentDAO studentDAO = new StudentDAO(emf);
        Student student = new Student("Adam", "22334455", "adam@gmail.com", "Herlev",
                StudentStatus.ACTIVE, LocalDate.of(2003, 1, 14), LocalDate.now(), Set.of(1, 2));
        Student savedStudent = studentDAO.createStudent(student);
        System.out.println(savedStudent);

        // Course
        CourseDAO courseDAO = new CourseDAO(emf);
        Course course = new Course("JPA Programmering", "Jon", "3. semester", "Room 101", "10:00");
        Course savedCourse = courseDAO.createCourse(course);
        System.out.println(savedCourse);






        emf.close();
    }
}