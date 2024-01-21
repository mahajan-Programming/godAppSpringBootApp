package com.bezkoder.spring.jpa.h2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Content {
    //Section will be like  Aarti, Stotram, Kahani, Pothi
    private String contentId;
    private String contentName;

    private String contentTag;
    private boolean favourite;
//    private MultipartFile multipartFile;
}
