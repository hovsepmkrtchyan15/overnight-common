package com.example.common.dto;

import com.example.common.entity.CityVillage;
import com.example.common.entity.Status;
import com.example.common.entity.Type;
import com.example.common.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCreateDto {


    private String name;
    private String address;
    private String description;
    private Type type;
    private String picUrl;
    private String googleAddress;
    private User user;
    private CityVillage cityVillage;


}
