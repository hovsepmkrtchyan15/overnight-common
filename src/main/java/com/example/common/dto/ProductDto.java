package com.example.common.dto;

import com.example.common.entity.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    @Range(message = "id cannot be 0")
    private int id;
    @NotNull(message = "cannot be null")
    private String name;
    @NotNull(message = "cannot be null")
    private String address;
    private String description;
    @NotNull(message = "cannot be null")
    private Type type;
    private String picUrl;
    @Min(1)
    @Max(5)
    private int rating;
    private String googleAddress;
    @Range(message = "id cannot be 0")
    private int user_id;

    @Range(message = "id cannot be 0")
    private int city_village_id;


}
