package com.bezkoder.spring.jpa.h2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Section {
    //Section will be like  Aartis, Stotrams, Kahanis, Pothis
    private String sectionId;
    private String sectionName;
    private List<Content> contentList;
}
