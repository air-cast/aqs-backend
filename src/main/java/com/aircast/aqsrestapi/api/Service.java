package com.aircast.aqsrestapi.api;

import com.aircast.aqsrestapi.datarecord.DataRecord;
import com.aircast.aqsrestapi.datarecord.DataRecordRepository;
import com.aircast.aqsrestapi.device.Device;
import com.aircast.aqsrestapi.device.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    DataRecordRepository dataRecordRepository;

    //to store device
    public Device setDevice(Device device) {
        //device.setCreatedAt(ZonedDateTime.now(ZoneOffset.UTC));
        deviceRepository.save(device);
        return device;
    }

    //To store a data record for a particular parameter e.g. PM2.5
    public void setDataRecord(DataRecord datarecord) {

        //datarecord.setCreatedAt(ZonedDateTime.now(ZoneOffset.UTC));
        dataRecordRepository.save(datarecord);
    }
}
