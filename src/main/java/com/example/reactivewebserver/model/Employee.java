package com.example.reactivewebserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2018/2/9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Employee {

    @Id
    private String id;
    private String name;
    private Long salary;
}
