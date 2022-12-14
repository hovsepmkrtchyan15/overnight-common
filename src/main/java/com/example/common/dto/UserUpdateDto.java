package com.example.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserUpdateDto {

    private int id;
    private String name;
    private String surname;
    @Email(message = "must be in the format of an email address")
    private String email;
    private String pic_url;


}
