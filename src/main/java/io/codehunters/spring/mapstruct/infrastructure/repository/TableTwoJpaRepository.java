package io.codehunters.spring.mapstruct.infrastructure.repository;

import io.codehunters.spring.mapstruct.infrastructure.repository.domain.TableTwoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableTwoJpaRepository extends JpaRepository<TableTwoEntity, Long> {
}
