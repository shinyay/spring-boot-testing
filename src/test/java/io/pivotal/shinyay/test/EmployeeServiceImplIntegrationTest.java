package io.pivotal.shinyay.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
public class EmployeeServiceImplIntegrationTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
        @Bean
        public EmployeeService employeeService() {
            return new EmployeeServiceImpl();
        }
    }

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Before
    public void setUp() {
        Employee emp1 = new Employee("Name1");
        emp1.setId(11L);
        Employee emp2 = new Employee("Name2");
        Employee emp3 = new Employee("Name3");

        List<Employee> allEmployees = Arrays.asList(emp1, emp2, emp3);

        Mockito.when(employeeRepository.findByName(emp1.getName())).thenReturn(emp1);
        Mockito.when(employeeRepository.findByName(emp2.getName())).thenReturn(emp2);
        Mockito.when(employeeRepository.findByName("Name9")).thenReturn(null);
        Mockito.when(employeeRepository.findById(emp1.getId())).thenReturn(Optional.of(emp1));
        Mockito.when(employeeRepository.findAll()).thenReturn(allEmployees);
        Mockito.when(employeeRepository.findById(-99L)).thenReturn(Optional.empty());
    }

}
