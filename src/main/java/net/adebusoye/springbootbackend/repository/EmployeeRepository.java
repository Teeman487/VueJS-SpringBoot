package net.adebusoye.springbootbackend.repository;

import net.adebusoye.springbootbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
