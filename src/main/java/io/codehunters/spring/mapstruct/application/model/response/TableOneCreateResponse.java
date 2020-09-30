package io.codehunters.spring.mapstruct.application.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TableOneCreateResponse {

    private Long id;

    private String attributeOne;

    private String attributeTwo;

    private TableTwoResponse tableTwo;
}
