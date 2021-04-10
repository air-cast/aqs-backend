package com.aircast.aqsrestapi.sequence;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
public class SequenceGenerator {

    // https://www.javaprogramto.com/2019/05/spring-boot-mongodb-auto-generated-field.html

    @Id
    private String id;

    private long seq;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }
}
