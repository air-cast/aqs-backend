package com.aircast.aqsrestapi.device;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {

    public Device findDeviceById(Long deviceid);

}
