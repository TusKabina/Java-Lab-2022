package com.ivanrogulj.exercise4.services;



import com.ivanrogulj.exercise4.entitites.Device;

import java.util.List;

public interface DeviceService {

    Device saveDevice(Device device, long id);
    Device getDeviceById(long id);
    List<Device> getAllDevices();

    Device updateDevice(Device device, long id);
    void deleteDeviceById(long id);


}
