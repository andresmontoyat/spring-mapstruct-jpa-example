package io.codehunters.spring.mapstruct.infrastructure.adapter.mapper.support;

import io.codehunters.spring.mapstruct.domain.model.support.DTO;
import io.codehunters.spring.mapstruct.infrastructure.repository.domain.support.Entities;
import org.mapstruct.MapperConfig;
import org.mapstruct.ObjectFactory;
import org.mapstruct.TargetType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaMapper {

    @PersistenceContext
    protected EntityManager em;

    @ObjectFactory
    public <T extends Entities> T reference(DTO dto, @TargetType Class<T> entityClass) {
        try {
            return (dto.getId() != null) ? em.getReference(entityClass, dto.getId()) : entityClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("An error has occurred trying to get new reference of entity", e);
        }
    }
}
