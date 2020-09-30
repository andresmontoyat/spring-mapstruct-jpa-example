package io.codehunters.spring.mapstruct.infrastructure.adapter;

import io.codehunters.spring.mapstruct.domain.model.TableOne;
import io.codehunters.spring.mapstruct.domain.service.TableOneService;
import io.codehunters.spring.mapstruct.infrastructure.repository.TableOneJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableOneAdapterService implements TableOneService {

    @Autowired
    private TableOneJpaRepository tableOneJpaRepository;

    @Override
    public TableOne save(TableOne tableOne) {
        return null;
    }

    @Override
    public TableOne merge(TableOne tableOne) {
        return null;
    }
}
