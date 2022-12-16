package com.example.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAuthDto {

    @Email(message = "must be in the format of an email address")
    @NotNull(message = "cannot be null")
    private String email;

    @Size(min = 4, max = 8, message = "Password must be between 4 and 8 characters")
    @NotNull(message = "cannot be null")
    private String password;
}
