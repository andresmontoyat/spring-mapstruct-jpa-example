package io.codehunters.spring.mapstruct.domain.model;

import io.codehunters.spring.mapstruct.domain.model.support.DTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TableOne extends DTO<Long> {

    private String attributeOne;

    private String attributeTwo;

    private TableTwo tableTwo;
}
