package com.ivanrogulj.exercise5.controllers;


import com.ivanrogulj.exercise5.entitites.Device;
import com.ivanrogulj.exercise5.services.DeviceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {


    private DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping("")
      public Device saveDevice(@RequestBody Device device) {
        return deviceService.saveDevice(device);

    }

    @GetMapping("")
    public Device getDevice( @RequestParam(required = true, name = "deviceId")long id) {

        return deviceService.getDeviceById(id);
    }

    @GetMapping("/all")
    private List<Device> getAllDevices()
    {
        return deviceService.getAllDevices();
    }

    @PutMapping("")
    public Device updateDevice(@RequestBody Device device, @RequestParam(required = true, name = "deviceId")long id)
    {
       return deviceService.updateDevice(device, id);
    }
    @DeleteMapping("")
    public String deleteDeviceById(@RequestParam(required = true, name = "deviceId")long id)
    {
        deviceService.deleteDeviceById(id);
        return "Deleted";
    }
}


