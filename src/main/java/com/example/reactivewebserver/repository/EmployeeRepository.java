package com.example.reactivewebserver.repository;

import com.example.reactivewebserver.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2018/2/9
 */
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
