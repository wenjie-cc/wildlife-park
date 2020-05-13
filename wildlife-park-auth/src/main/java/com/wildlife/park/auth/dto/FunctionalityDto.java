package com.wildlife.park.auth.dto;

import com.wildlife.park.auth.entity.Functionality;
import lombok.Builder;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author wenjie
 */
@Data
@Builder
public class FunctionalityDto {
    private Long id;
    private String title;
    private Set<FunctionalityDto> children;

    public static FunctionalityDto of(Functionality functionality) {
        if (functionality == null) {
            return null;
        }
        return FunctionalityDto.builder().id(functionality.getId()).title(functionality.getName())
                .children(functionality.getChildren().stream().map(FunctionalityDto::of).collect(Collectors.toSet())).build();
    }
}
