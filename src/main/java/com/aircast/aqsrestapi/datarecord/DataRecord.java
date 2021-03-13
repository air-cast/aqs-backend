package com.aircast.aqsrestapi.datarecord;

import javax.persistence.*;

@Entity
@Table(name = "datarecord")
public class DataRecord {

    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false)
    Long deviceId;

    @Column(nullable = false)
    Long temperature;

    @Column(nullable = false)
    Long humidity;

    @Column(nullable = false)
    Long aqi;


}
