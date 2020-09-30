package io.codehunters.spring.mapstruct.application.model;

import io.codehunters.spring.mapstruct.application.model.request.TableOneCreateRequest;
import io.codehunters.spring.mapstruct.application.model.response.TableOneCreateResponse;
import io.codehunters.spring.mapstruct.domain.model.TableOne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TableOneModelMapper {

    @Mapping(target = "tableTwo.id", source = "tableTwoId")
    TableOne toTableOne(TableOneCreateRequest tableOneCreateRequest);

    TableOneCreateResponse toTableOneCreateResponse(TableOne  tableOne);
}
