package com.dxl.springboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wikimedia_recentchange")
@Getter
@Setter
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //because the data is big we need to use lob
    @Column(columnDefinition = "LONGTEXT")
    private String wikiEventData;
}
