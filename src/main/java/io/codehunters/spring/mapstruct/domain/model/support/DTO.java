package io.codehunters.spring.mapstruct.domain.model.support;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DTO<ID> {

    protected ID id;
}
