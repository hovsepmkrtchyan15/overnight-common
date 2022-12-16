package com.example.common.dto;

import com.example.common.entity.Product;
import com.example.common.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserBookOrderDto {

    private int id;
    @NotNull(message = "cannot be null")
    private User user;
    @NotNull(message = "cannot be null")
    private Product product;
    @NotNull(message = "cannot be null")
    private String startDate;
    @NotNull(message = "cannot be null")
    private String endDate;


}
