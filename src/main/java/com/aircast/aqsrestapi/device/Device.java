package com.aircast.aqsrestapi.device;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.Timestamp;

@Entity
@Table(name = "device")
public class Device {

    @Id
    Long id;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Timestamp createdAt;

    @Column(nullable = false)
    Long codeVersionId;

}
