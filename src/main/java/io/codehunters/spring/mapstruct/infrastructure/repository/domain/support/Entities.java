package io.codehunters.spring.mapstruct.infrastructure.repository.domain.support;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class Entities<ID extends Serializable> extends Auditable implements Persistable<ID> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected ID id;

    @Override
    public ID getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return (this.id == null);
    }
}
