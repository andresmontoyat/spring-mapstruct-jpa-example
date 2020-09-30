package io.codehunters.spring.mapstruct.infrastructure.adapter;

import io.codehunters.spring.mapstruct.domain.model.TableOne;
import io.codehunters.spring.mapstruct.domain.service.TableOneService;
import io.codehunters.spring.mapstruct.infrastructure.adapter.mapper.TableOneAdapterMapper;
import io.codehunters.spring.mapstruct.infrastructure.repository.TableOneJpaRepository;
import io.codehunters.spring.mapstruct.infrastructure.repository.domain.TableOneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableOneAdapterService implements TableOneService {

    @Autowired
    private TableOneJpaRepository tableOneJpaRepository;

    @Autowired
    private TableOneAdapterMapper mapper;

    @Override
    public TableOne save(TableOne tableOne) {
        TableOneEntity tableOneEntity = mapper.toTableOneEntity(tableOne);
        return mapper.toTableOne(tableOneJpaRepository.save(tableOneEntity));
    }

    @Override
    public TableOne merge(TableOne tableOne) {
        return null;
    }
}
