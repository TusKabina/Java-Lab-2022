package com.ivanrogulj.exercise5.services;



import com.ivanrogulj.exercise5.entitites.Device;

import java.util.List;

public interface DeviceService {

    Device saveDevice(Device device);
    Device getDeviceById(long id);
    List<Device> getAllDevices();

    Device updateDevice(Device device, long id);
    void deleteDeviceById(long id);


}
