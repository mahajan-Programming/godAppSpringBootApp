package com.bezkoder.spring.jpa.h2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private String fullName;
    private String incomeStatus;
    private List<String> similarRoles;
}
