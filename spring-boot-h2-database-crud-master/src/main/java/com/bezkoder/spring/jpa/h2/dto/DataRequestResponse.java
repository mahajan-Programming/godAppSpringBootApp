package com.bezkoder.spring.jpa.h2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataRequestResponse {
    private String requestResponseId;
    private List<User> userList;
}
