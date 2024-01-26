package com.bezkoder.spring.jpa.h2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.Table;


@Entity
@Data
@Table(name="pothi")
public class PothiEntity {
//    @Id
//        @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer tableid;

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "userId")
    private String userId;
    @Column(name = "userName")
    private String userName;

    @Column(name = "bucketid")
    private String bucketId;
    @Column(name = "bucketname")
    private String bucketName;

    @Column(name = "sectionid")
    private String sectionId;
    @Column(name = "sectionname")
    private String sectionName;

    @Column(name = "contentid")
    private String contentId;
    @Column(name = "contentname")
    private String contentName;
    @Column(name = "contenttag")
    private String contentTag;
    @Column(name = "favourites")
    private Boolean favourites;

    @Column(name = "contentLink")
    private Boolean contentLink;

}
