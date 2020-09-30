package io.codehunters.spring.mapstruct.domain.service;

import io.codehunters.spring.mapstruct.domain.model.TableOne;

public interface TableOneService {

    TableOne save(TableOne tableOne);

    TableOne merge(TableOne tableOne);
}
