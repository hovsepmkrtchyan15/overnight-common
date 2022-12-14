package com.example.common.dto;

import com.example.common.entity.StatusSeller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserStatusDto {
    private int id;
    private StatusSeller status;

}
