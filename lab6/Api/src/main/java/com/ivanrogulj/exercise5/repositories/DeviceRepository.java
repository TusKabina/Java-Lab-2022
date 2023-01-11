package com.ivanrogulj.exercise5.repositories;

import com.ivanrogulj.exercise5.entitites.Client;
import com.ivanrogulj.exercise5.entitites.Device;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {

    Page<Device> findAll(Pageable pageable);

}
