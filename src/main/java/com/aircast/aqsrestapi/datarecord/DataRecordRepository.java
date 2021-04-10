package com.aircast.aqsrestapi.datarecord;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DataRecordRepository extends MongoRepository<DataRecord, Long> {

    public List<DataRecord> getDataRecordByDeviceId(Long deviceId);

}
