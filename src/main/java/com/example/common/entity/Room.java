package com.example.overnightweb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double price;
    private Date startDate;
    private Date endDate;
    private int bedsCount;
    @Enumerated(value = EnumType.STRING)
    private Status roomStatus;
    @ManyToOne
    private Product product;


}
