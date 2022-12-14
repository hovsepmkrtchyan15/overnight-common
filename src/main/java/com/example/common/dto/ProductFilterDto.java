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
public class ProductFilterDto {

        private String name;
        private String address;
        private Type type;
        private int rating;

}
