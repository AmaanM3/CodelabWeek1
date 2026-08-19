package entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String phone;
    private String email;
    private String address;

    private StudentStatus status;

    private LocalDate dateOfBirth;
    private LocalDate dateOfEnrollment;

    @ElementCollection
    private Set<Integer> courseIds;

    public Student(String name, String phone, String email, String address,
                   StudentStatus status, LocalDate dateOfBirth, LocalDate
                           dateOfEnrollment, Set<Integer> courseIds) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.status = status;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEnrollment = dateOfEnrollment;
        this.courseIds = courseIds;
    }
}