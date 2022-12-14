package com.example.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private Type type;
    private String picUrl;
    private int rating;
    private String googleAddress;
    @Enumerated(value = EnumType.STRING)
    private Status status;
    @ManyToOne
    private User user;
    @ManyToOne
    private CityVillage cityVillage;
    private int ratingUserCount;
}
