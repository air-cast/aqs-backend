package com.aircast.aqsrestapi.device;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository extends MongoRepository<Device, Long> {

    public Device findDeviceById(Long deviceid);

}
