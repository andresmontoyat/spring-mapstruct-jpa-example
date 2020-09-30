package io.codehunters.spring.mapstruct.infrastructure.repository;

import io.codehunters.spring.mapstruct.infrastructure.repository.domain.TableOneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableOneJpaRepository extends JpaRepository<TableOneEntity, Long> {
}
