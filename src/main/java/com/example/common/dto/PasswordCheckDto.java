package com.example.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class PasswordCheckDto {

    @NotNull(message = "cannot be null")
    private String oldPassword;

    @Size(min = 4, max = 8, message = "Password must be between 4 and 8 characters")
    @NotNull(message = "cannot be null")
    private String newPassword;

    @NotNull(message = "cannot be null")
    private String confirmPassword;

}
