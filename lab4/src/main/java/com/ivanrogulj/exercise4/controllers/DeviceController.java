package com.ivanrogulj.exercise4.controllers;


import com.ivanrogulj.exercise4.entitites.Device;
import com.ivanrogulj.exercise4.services.DeviceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {


    private DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping("/device/{id}")
      public Device saveDevice(@RequestBody Device device, @PathVariable("id")long id) {
        return deviceService.saveDevice(device, id);

    }

    @GetMapping("/device/{id}")
    public Device getDevice(@PathVariable("id")long id) {

        return deviceService.getDeviceById(id);
    }

    @GetMapping("/device")
    private List<Device> getAllDevices()
    {
        return deviceService.getAllDevices();
    }
}


