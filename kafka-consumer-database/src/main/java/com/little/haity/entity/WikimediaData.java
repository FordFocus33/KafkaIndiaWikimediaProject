package com.little.haity.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity(name = "wikimedia_data")
@Data
public class WikimediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "text")
    private String wikiEventData;
}
