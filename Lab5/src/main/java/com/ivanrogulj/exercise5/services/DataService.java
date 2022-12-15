package com.ivanrogulj.exercise5.services;




import com.ivanrogulj.exercise5.entitites.Data;

import java.util.ArrayList;
import java.util.List;

public interface DataService {

    String saveData(Data data, long id);
    Data getDataById(long id);
    List<Data> getAllData();
   Data updateData(Data data, Long id);
    void deleteDataById(long id);

    public String accumulate(String year);
    public  String getTotalValuesByYearAndMonth(String year, String month);
    public ArrayList<String> getByMonthAndYear(String year);

}
