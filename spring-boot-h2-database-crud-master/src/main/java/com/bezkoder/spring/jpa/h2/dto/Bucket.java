package com.bezkoder.spring.jpa.h2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bucket {
    // Bucket can be anything like Mon,Tue,Wed....; Om, Ganpati, Swamisamartha...
    private String bucketId;
    private String bucketName;
    private List<Section> sectionList;
}
