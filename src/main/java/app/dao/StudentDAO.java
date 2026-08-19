package app.dao;

import entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class StudentDAO {

    private final EntityManagerFactory emf;

    public StudentDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Student createStudent(Student student) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();

        em.close();

        return student;
    }
}