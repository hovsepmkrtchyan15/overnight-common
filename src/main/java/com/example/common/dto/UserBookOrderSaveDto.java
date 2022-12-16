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

public class UserBookOrderSaveDto {

    private int id;

    private User user;

    private Product product;

    private Date startDate;

    private Date endDate;


}
