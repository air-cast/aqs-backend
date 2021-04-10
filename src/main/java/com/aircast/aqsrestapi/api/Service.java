package com.aircast.aqsrestapi.api;

import com.aircast.aqsrestapi.datarecord.DataRecord;
import com.aircast.aqsrestapi.datarecord.DataRecordRepository;
import com.aircast.aqsrestapi.device.Device;
import com.aircast.aqsrestapi.device.DeviceRepository;
import com.aircast.aqsrestapi.sequence.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    DataRecordRepository dataRecordRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    //to store device
    public Device setDevice(Device device) {
        //device.setCreatedAt(ZonedDateTime.now(ZoneOffset.UTC));

        deviceRepository.save(device);
        return device;
    }

    //To store a data record for a particular parameter e.g. PM2.5
    public void setDataRecord(DataRecord datarecord) {

        //datarecord.setCreatedAt(ZonedDateTime.now(ZoneOffset.UTC));
        datarecord.setId(sequenceGeneratorService.generateSequence(DataRecord.SEQUENCE_NAME));
        dataRecordRepository.save(datarecord);
    }

    public List<DataRecord> getDataRecordOfDevice(Long deviceId) {

        return dataRecordRepository.getDataRecordByDeviceId(deviceId);
    }

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

}
