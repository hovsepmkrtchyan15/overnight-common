package com.example.common.dto;

import com.example.common.entity.Product;
import com.example.common.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserBookDto {

    @NotNull(message = "cannot be null")
    private User user;

    @NotNull(message = "cannot be null")
    private Product product;

    @Min(1)
    @Max(5)
    private int rating;


}
