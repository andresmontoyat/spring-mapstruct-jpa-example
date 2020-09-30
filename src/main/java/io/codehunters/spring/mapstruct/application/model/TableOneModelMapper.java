package io.codehunters.spring.mapstruct.application.model;

import io.codehunters.spring.mapstruct.application.model.request.TableOneCreateRequest;
import io.codehunters.spring.mapstruct.application.model.response.TableOneCreateResponse;
import io.codehunters.spring.mapstruct.domain.model.TableOne;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TableOneModelMapper {

    TableOne toTableOne(TableOneCreateRequest tableOneCreateRequest);

    TableOneCreateResponse toTableOneCreateResponse(TableOne  tableOne);
}
