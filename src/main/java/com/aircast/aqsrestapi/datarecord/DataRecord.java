package com.aircast.aqsrestapi.datarecord;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import java.time.ZonedDateTime;
import java.util.Date;

@Document
public class DataRecord {

    // https://www.javaprogramto.com/2019/05/spring-boot-mongodb-auto-generated-field.html

    @Transient
    public static final String SEQUENCE_NAME = "data-record_sequence";

    @Id
    Long id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt = new Date();
    //ZonedDateTime createdAt;

    Long deviceId;

    Double PM_SP_UG_1_0;
    Double PM_SP_UG_2_5;
    Double PM_SP_UG_10_0;
    Double PM_AE_UG_1_0;
    Double PM_AE_UG_2_5;
    Double PM_AE_UG_10_0;
    Double Temperature;
    Double Humidity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public static String getSequenceName() {
        return SEQUENCE_NAME;
    }

    public Double getPM_SP_UG_1_0() {
        return PM_SP_UG_1_0;
    }

    public void setPM_SP_UG_1_0(Double PM_SP_UG_1_0) {
        this.PM_SP_UG_1_0 = PM_SP_UG_1_0;
    }

    public Double getPM_SP_UG_2_5() {
        return PM_SP_UG_2_5;
    }

    public void setPM_SP_UG_2_5(Double PM_SP_UG_2_5) {
        this.PM_SP_UG_2_5 = PM_SP_UG_2_5;
    }

    public Double getPM_SP_UG_10_0() {
        return PM_SP_UG_10_0;
    }

    public void setPM_SP_UG_10_0(Double PM_SP_UG_10_0) {
        this.PM_SP_UG_10_0 = PM_SP_UG_10_0;
    }

    public Double getPM_AE_UG_1_0() {
        return PM_AE_UG_1_0;
    }

    public void setPM_AE_UG_1_0(Double PM_AE_UG_1_0) {
        this.PM_AE_UG_1_0 = PM_AE_UG_1_0;
    }

    public Double getPM_AE_UG_2_5() {
        return PM_AE_UG_2_5;
    }

    public void setPM_AE_UG_2_5(Double PM_AE_UG_2_5) {
        this.PM_AE_UG_2_5 = PM_AE_UG_2_5;
    }

    public Double getPM_AE_UG_10_0() {
        return PM_AE_UG_10_0;
    }

    public void setPM_AE_UG_10_0(Double PM_AE_UG_10_0) {
        this.PM_AE_UG_10_0 = PM_AE_UG_10_0;
    }

    public Double getTemperature() {
        return Temperature;
    }

    public void setTemperature(Double temperature) {
        Temperature = temperature;
    }

    public Double getHumidity() {
        return Humidity;
    }

    public void setHumidity(Double humidity) {
        Humidity = humidity;
    }
}
