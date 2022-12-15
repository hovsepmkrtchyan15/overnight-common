package com.example.common.dto;

import com.example.common.entity.CityVillage;
import com.example.common.entity.Type;
import com.example.common.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCreateDto {

    @NotNull(message = "cannot be null")
    private String name;
    @NotNull(message = "cannot be null")
    private String address;
    private String description;
    @NotNull(message = "cannot be null")
    private Type type;
    private String picUrl;
    private String googleAddress;
    @NotNull(message = "cannot be null")
    private User user;
    @NotNull(message = "not null")
    private CityVillage cityVillage;


}
