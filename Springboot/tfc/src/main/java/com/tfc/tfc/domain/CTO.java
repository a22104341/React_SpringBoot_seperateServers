package com.tfc.tfc.domain;

import ch.qos.logback.core.status.Status;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

enum StatusCto {
    PUBLICADO,
    EM_EDICAO,
    ESPERA_APROVACAO,
    NEGADO
}

@Entity
@Table(name = "ctos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(NON_DEFAULT)
public class CTO {
    @Id
    @UuidGenerator
    @Column(name = "uuid", unique = true, updatable = false)
    private String uuid;
    private int id;
    private StatusCto status;
    private String startDate;
    private String endDate;
}