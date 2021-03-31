package com.aircast.aqsrestapi.api;

import com.aircast.aqsrestapi.datarecord.DataRecord;
import com.aircast.aqsrestapi.device.Device;
import com.aircast.aqsrestapi.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@RequestMapping("/api")
public class Controller {
    @Autowired
    Service service;

    @RequestMapping(value = {"/device"}, method = RequestMethod.POST)
    public @ResponseBody
    Response SetDevice(@RequestBody Device device) {
        Response response = new Response();
        service.setDevice(device);
        response.setResponse("DEVICE REGISTERED");
        return response;
    }


    //Add new packet records
    @RequestMapping(value = {"device/datarecord"}, method = RequestMethod.POST)
    public @ResponseBody
    Response SetDatarecord(@RequestBody DataRecord datarecord) {
        Response response = new Response();
        service.setDataRecord(datarecord);
        response.setResponse("DATA SAVED");
        return response;
    }
}
