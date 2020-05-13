package com.wildlife.park.auth.dto;

import com.wildlife.park.auth.entity.User;
import lombok.Builder;
import lombok.Data;

/**
 * @author wenjie
 */
@Data
@Builder
public class UserDto {
    private Long id;
    private String name;
    private Integer age;
    private String memo;

    public static UserDto of(User entity) {
        return UserDto.builder().id(entity.getId()).name(entity.getName()).build();
    }
}
