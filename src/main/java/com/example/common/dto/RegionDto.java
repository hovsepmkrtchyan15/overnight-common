package com.example.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegionDto {

    @Range(message = "id cannot be 0")
    private int id;
    @NotNull(message = "cannot be null")
    private String name;

}
