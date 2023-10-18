package net.adebusoye.springbootbackend;

import net.adebusoye.springbootbackend.entity.Employee;
import net.adebusoye.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static ch.qos.logback.classic.spi.ThrowableProxyVO.build;

// creating my Database
@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = Employee.builder().
                firstName("Toheeb")
                        .lastName("Akinade")
                                .email("ade4@gmail.com")
                .build();
        Employee employee2 = Employee.builder().
                firstName("Rofiat")
                .lastName("Ogundimu")
                .email("morenike3@gmail.com")
                .build();
        Employee employee3 = Employee.builder().
                firstName("Aisha")
                .lastName("Akinade")
                .email("aisha4@gmail.com")
                .build();
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }
}
