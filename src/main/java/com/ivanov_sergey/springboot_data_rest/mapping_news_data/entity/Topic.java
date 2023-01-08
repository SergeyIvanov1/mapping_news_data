package com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
//@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
}
