package com.ivanrogulj.exercise4.services;




import com.ivanrogulj.exercise4.entitites.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface DataService {

    Data saveData(Data data, long id);
    Data getDataById(long id);
    List<Data> getAllData();
   Data updateData(Data data, Long id);
    void deleteDataById(long id);
    public String accumulate(String year);
    public  String getTotalValuesByYearAndMonth(String year, String month);
    public ArrayList<String> getByMonthAndYear(String year);

}
