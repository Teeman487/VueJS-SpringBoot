package net.adebusoye.springbootbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="first_name", nullable = false )
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String email;
}
