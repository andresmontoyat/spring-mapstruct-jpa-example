package io.codehunters.spring.mapstruct.infrastructure.adapter.mapper;

import io.codehunters.spring.mapstruct.domain.model.TableOne;
import io.codehunters.spring.mapstruct.infrastructure.adapter.mapper.support.JpaMapper;
import io.codehunters.spring.mapstruct.infrastructure.repository.domain.TableOneEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {JpaMapper.class, TableTwoAdapterMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface TableOneAdapterMapper {

    TableOneEntity toTableOneEntity(TableOne tableOne);

    TableOne toTableOne(TableOneEntity tableOneEntity);
}

