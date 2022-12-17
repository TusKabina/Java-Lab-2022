package com.ivanrogulj.exercise5.services;




import com.ivanrogulj.exercise5.entitites.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface DataService {

    String saveData(Data data, long id);
    Data getDataById(long id);
    List<Data> getAllData();
   Data updateData(Data data, Long id);
    void deleteDataById(long id);

//    public String accumulateByYear(String year);
//    public  String monthlyUsage(String year, String month);
//    public ArrayList<String> usageByYear(String year);
    public List<String> filterData(Map<String,String> searchParams);
}
