package app.config;

import entities.Person;
import entities.Student;
import org.hibernate.cfg.Configuration;

final class EntityRegistry {

    private EntityRegistry() {}

    static void registerEntities(Configuration configuration) {
        configuration.addAnnotatedClass(Person.class);
        configuration.addAnnotatedClass(Student.class);
    }
}