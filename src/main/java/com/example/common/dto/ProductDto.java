package com.example.common.dto;

import com.example.common.entity.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    private int id;
    private String name;
    private String address;
    private String description;
    private Type type;
    private String picUrl;
    private int rating;
    private String googleAddress;
    private int user_id;
    private int city_village_id;


}
