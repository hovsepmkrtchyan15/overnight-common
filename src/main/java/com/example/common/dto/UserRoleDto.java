package com.example.common.dto;

import com.example.common.entity.RoleUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRoleDto {

    @NotNull(message = "cannot be null")
    private RoleUser role;

}
