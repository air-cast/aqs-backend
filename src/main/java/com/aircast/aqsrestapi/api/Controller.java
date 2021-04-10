package com.aircast.aqsrestapi.api;

import com.aircast.aqsrestapi.datarecord.DataRecord;
import com.aircast.aqsrestapi.device.Device;
import com.aircast.aqsrestapi.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = {"/api"})
public class Controller {
    @Autowired
    Service service;

    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    ////////////////////POST REQUEST METHODS/////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////

    //Register a new device
    @RequestMapping(value = {"/devices/{device-id}"}, method = RequestMethod.POST)
    public @ResponseBody
    Response SetDevice(@RequestBody Device device) {

        Response response = new Response();

//        if (service.deviceIdExist(device.getId()))
//        {
//            response.setResponse("DEVICE ID ALREADY EXIST");
//        }
//        else if (service.codeVersionNotExist(device.getCodeVersionId()))
//        {
//            response.setResponse("INVALID CODE VERSION");
//        }
//        else
        {
            service.setDevice(device);
            response.setResponse("DEVICE REGISTERED");
        }
        return response;
    }


    //Add new packet records
    @RequestMapping(value = {"/devices/{device-id}/datarecord"}, method = RequestMethod.POST)
    public @ResponseBody
    Response SetDatarecord(@RequestBody DataRecord datarecord) {
        Response response = new Response();
//        if (service.deviceIdNotExist(datarecord.getDeviceId()))
//        {
//            response.setResponse("DEVICE ID NOT EXIST");
//        }
//        else
//        {
        service.setDataRecord(datarecord);
        //service.updatePublicsiePartnerPreviousPm25Aqi(datarecord);
        response.setResponse("DATA SAVED");
//        }
        return response;
    }



    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    ////////////////////GET REQUEST METHODS/////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////

//    @RequestMapping(value = {"/devices/{device-id}/datarecord"}, method = RequestMethod.GET)
//    public @ResponseBody
//    ArrayList<DataRecord> getDatarecord() {
//
//
//
//        return service.getDataRecord();;
//    }

    @RequestMapping(value = {"/devices/{device-id}/datarecord"}, method = RequestMethod.GET)
    public @ResponseBody
    List<DataRecord> getDataRecordOfDevice(@PathVariable("device-id") Long deviceId) {

        return service.getDataRecordOfDevice(deviceId);
    }

    @RequestMapping(value = {"/devices"}, method = RequestMethod.GET)
    public @ResponseBody
    List<Device> getAllDevices() {

        return service.getAllDevices();
    }

}
