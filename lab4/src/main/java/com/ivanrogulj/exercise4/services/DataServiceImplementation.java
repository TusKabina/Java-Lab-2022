package com.ivanrogulj.exercise4.services;

import com.ivanrogulj.exercise4.entitites.Data;
import com.ivanrogulj.exercise4.repositories.DataRepository;
import com.ivanrogulj.exercise4.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class DataServiceImplementation implements DataService {

    @Autowired
    private DataRepository dataRepository;
    @Autowired
   private DeviceRepository deviceRepository;

    @Override
    public Data saveData(Data data, long id) {
        data.setDevice(deviceRepository.findById(id).get());
        return dataRepository.save(data);
    }

    @Override
    public Data getDataById(long id) {
        return dataRepository.findById(id).get();
    }

    @Override
    public List<Data> getAllData() {
        List<Data> datas = new ArrayList<Data>();
        dataRepository.findAll().forEach(data -> datas.add(data));
        return datas;
    }

    @Override
    public Data updateData(Data data, Long id) {
        Data dataDB = dataRepository.findById(id).get();

        if (Objects.nonNull(data.getMonth())
                && !"".equalsIgnoreCase(
                data.getMonth())) {
            dataDB.setMonth(
                    data.getMonth());
        }

        if (Objects.nonNull(
                data.getYear())
                && !"".equalsIgnoreCase(
                data.getYear())) {
            dataDB.setYear(
                    data.getYear());
        }

        if (Objects.nonNull(
                data.getValue())
                && !"".equalsIgnoreCase(
                data.getValue())) {
            dataDB.setValue(
                    data.getValue());
        }
        return dataRepository.save(dataDB);
    }

    @Override
    public void deleteDataById(long id) {
       dataRepository.deleteById(id);

    }

    @Override
    public String accumulate(String year)
    {
        return dataRepository.getTotalValuesByYear(year);
    }

    @Override
    public String getTotalValuesByYearAndMonth(String year, String month) {
        return dataRepository.getTotalValuesByYearAndMonth(year, month);
    }

    @Override
    public ArrayList<String> getByMonthAndYear(String year) {
        return dataRepository.getTotalValuesByYearPerMonth(year);
    }


}
