package com.ivanrogulj.exercise4.repositories;

import com.ivanrogulj.exercise4.entitites.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {


}
