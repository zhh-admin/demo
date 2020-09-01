package com.example.designPatterns.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDO {
    private Long id;
    private String name;
}
