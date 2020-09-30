package io.codehunters.spring.mapstruct.application.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TableOneCreateRequest {

    private String attributeOne;

    private String attributeTwo;

    private Long tableTwoId;
}
