package com.aircast.aqsrestapi.device;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Document
public class Device {

    @Id
    Long id;

    ZonedDateTime createdAt;

    Long codeVersionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCodeVersionId() {
        return codeVersionId;
    }

    public void setCodeVersionId(Long codeVersionId) {
        this.codeVersionId = codeVersionId;
    }
}
