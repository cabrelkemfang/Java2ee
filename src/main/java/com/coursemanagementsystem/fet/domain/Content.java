package com.coursemanagementsystem.fet.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "content")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "content_id")
    private Long contentId;

    @Column(name = "chapter_number")
    private int chapterNumber;

    @Column(name = "content")
    private String content;


}
