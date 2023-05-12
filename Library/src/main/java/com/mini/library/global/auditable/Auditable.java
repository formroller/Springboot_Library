package com.mini.library.global.auditable;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class Auditable {

    @CreatedBy
    @Column(name="lenddate", updatable = false)
    private LocalDateTime lendDate;

    @LastModifiedDate
    @Column(name = "returndate")
    private LocalDateTime returnDate;

}
