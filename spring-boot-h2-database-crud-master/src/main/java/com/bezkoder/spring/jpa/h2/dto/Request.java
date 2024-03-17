package com.bezkoder.spring.jpa.h2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Request {
    private String firstName;
    private String lastName;
    private Integer age;
    private String jobRole;
    private String salary;
}
