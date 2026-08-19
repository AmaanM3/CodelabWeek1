package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String teacher;
    private String semester;
    private String classroom;
    private String timeOfCourse;

    public Course(String name, String teacher, String semester, String classroom, String timeOfCourse) {
        this.name = name;
        this.teacher = teacher;
        this.semester = semester;
        this.classroom = classroom;
        this.timeOfCourse = timeOfCourse;
    }
}