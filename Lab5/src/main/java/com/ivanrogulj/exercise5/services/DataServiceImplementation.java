package com.ivanrogulj.exercise5.services;

import com.ivanrogulj.exercise5.entitites.Data;
import com.ivanrogulj.exercise5.repositories.DataRepository;
import com.ivanrogulj.exercise5.repositories.DeviceRepository;
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
    public String saveData(Data data, long id) {

        List<String> months = new ArrayList<>();
        months = dataRepository.getDataMonthForId(id, data.getYear());

        for(String m : months)
        {
            if(Objects.equals(m, data.getMonth()))
            {
                return "Error!";
            }
        }
        data.setDevice(deviceRepository.findById(id).get());
        dataRepository.save(data);
        return "Data saved";
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
    public String accumulateByYear(String year)
    {
        return dataRepository.getTotalValuesByYear(year);
    }

    @Override
    public String monthlyUsage(String year, String month) {
        return dataRepository.getTotalValuesByYearAndMonth(year, month);
    }

    @Override
    public ArrayList<String> usageByYear(String year) {
        return dataRepository.getTotalValuesByYearPerMonth(year);
    }


}
