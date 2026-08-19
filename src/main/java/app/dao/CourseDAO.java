package app.dao;

import entities.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class CourseDAO {

    private final EntityManagerFactory emf;

    public CourseDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Course createCourse(Course course) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();

        em.close();

        return course;
    }
}