package com.aircast.aqsrestapi.datarecord;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRecordRepository extends MongoRepository<DataRecord, Long> {

}
