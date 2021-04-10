//package com.aircast.aqsrestapi.sequence;
//
//import com.aircast.aqsrestapi.datarecord.DataRecord;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SequenceGeneratoreServiceListener {
//
//    private SequenceGeneratorService sequenceGeneratorService;
//
//    @Autowired
//    public void DatarecordModelListener(SequenceGeneratorService sequenceGeneratorService) {
//        this.sequenceGeneratorService = sequenceGeneratorService;
//    }
//
////    @Override
////    public void onBeforeConvert(BeforeConvertEvent event) {
////        if (event.getSource().getId() < 1) {
////            event.getSource().setId(sequenceGeneratorService.generateSequence(DataRecord.SEQUENCE_NAME));
////        }
////    }
//
//}
