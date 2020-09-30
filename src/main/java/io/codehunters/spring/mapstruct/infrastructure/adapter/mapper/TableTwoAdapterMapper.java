package io.codehunters.spring.mapstruct.infrastructure.adapter.mapper;

import io.codehunters.spring.mapstruct.domain.model.TableTwo;
import io.codehunters.spring.mapstruct.infrastructure.adapter.mapper.support.JpaMapper;
import io.codehunters.spring.mapstruct.infrastructure.repository.domain.TableTwoEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = JpaMapper.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TableTwoAdapterMapper {

    @BeanMapping(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    TableTwoEntity toTableTwoEntity(TableTwo tableTwo);
}
