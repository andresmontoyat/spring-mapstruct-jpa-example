package io.codehunters.spring.mapstruct.infrastructure.repository.domain;

import io.codehunters.spring.mapstruct.infrastructure.repository.domain.support.Entities;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "table_one")
public class TableOneEntity extends Entities<Long> {

    @Column(name = "attribute_one", nullable = false, length = 20)
    private String attributeOne;

    @Column(name = "attribute_two", length = 80)
    private String attributeTwo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "table_two", referencedColumnName = "id")
    private TableTwoEntity tableTwo;
}
