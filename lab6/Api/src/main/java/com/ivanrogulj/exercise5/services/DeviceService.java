package com.ivanrogulj.exercise5.services;



import com.ivanrogulj.exercise5.entitites.Client;
import com.ivanrogulj.exercise5.entitites.Device;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DeviceService {

    Device saveDevice(Device device, long id);
    Device getDeviceById(long id);
    //List<Device> getAllDevices();

    Page<Device> getAllDevices(Pageable pageable);
    Device updateDevice(Device device, long id);
    void deleteDeviceById(long id);


}
