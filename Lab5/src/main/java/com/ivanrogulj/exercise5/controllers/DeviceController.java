package com.ivanrogulj.exercise5.controllers;


import com.ivanrogulj.exercise5.entitites.Device;
import com.ivanrogulj.exercise5.services.DeviceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    ResponseEntity<Device> saveDevice(@RequestBody Device device) {
        return new ResponseEntity<>(deviceService.saveDevice(device),HttpStatus.OK);

    }

    @GetMapping("")
     ResponseEntity<Device> getDevice( @RequestParam(required = true, name = "deviceId")long id) {

        return new ResponseEntity<>(deviceService.getDeviceById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    ResponseEntity<List<Device>> getAllDevices()
    {
        return new ResponseEntity<>(deviceService.getAllDevices(),HttpStatus.OK);
    }

    @PutMapping("")
    ResponseEntity<Device> updateDevice(@RequestBody Device device, @RequestParam(required = true, name = "deviceId")long id)
    {
       return new ResponseEntity<>(deviceService.updateDevice(device, id),HttpStatus.OK);
    }
    @DeleteMapping("")
    ResponseEntity<String> deleteDeviceById(@RequestParam(required = true, name = "deviceId")long id)
    {
        deviceService.deleteDeviceById(id);
        return new ResponseEntity<>("Deleted!",HttpStatus.OK);
    }
}


