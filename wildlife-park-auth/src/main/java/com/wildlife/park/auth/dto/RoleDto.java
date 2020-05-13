package com.wildlife.park.auth.dto;

import com.wildlife.park.auth.entity.Role;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author wenjie
 */
@Data
@Builder
public class RoleDto {
    private Long id;
    private String name;
    private String memo;
    private boolean enabled;
    private Set<FunctionalityDto> functionaries;

    public static RoleDto of(Role role) {
        return RoleDto.builder().id(role.getId()).name(role.getName()).memo(role.getMemo()).enabled(role.isEnabled())
                .functionaries(role.getFunctionaries().stream().map(FunctionalityDto::of).collect(Collectors.toSet())).build();
    }

    public static RoleDto ref(Role role) {
        return RoleDto.builder().id(role.getId()).name(role.getName()).enabled(role.isEnabled()).build();
    }
}
