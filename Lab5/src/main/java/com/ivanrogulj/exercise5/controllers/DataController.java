package com.ivanrogulj.exercise5.controllers;

import com.ivanrogulj.exercise5.entitites.Data;
import com.ivanrogulj.exercise5.services.DataService;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {


    private DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }


//    @PostMapping("")
//    public Data saveData(@RequestBody Data data,  @RequestParam(required = true, name = "deviceId")long id) {
//
//        return dataService.saveData(data,id);
//
//    }


    @PostMapping("")
    public String saveData(@RequestBody Data data, @RequestParam(required = true, name = "deviceId")@NotNull @NumberFormat(style = NumberFormat.Style.NUMBER) long id) {

        String status = dataService.saveData(data,id);
        return status;

    }


    @GetMapping("")
    public Data getData(@RequestParam(required = true, name = "dataId")long id) {

        return dataService.getDataById(id);
    }

    @GetMapping("/all")
    private List<Data> getAllData()
    {
        return dataService.getAllData();
    }

    @PutMapping("")
    public Data
    updateData(@RequestBody Data data,
               @RequestParam(required = true, name = "dataId")long id)
    {
        return dataService.updateData(
                data, id);
    }


    @DeleteMapping("")
    public String deleteDataById(@RequestParam(required = true, name = "dataId")long id)
    {
        dataService.deleteDataById(id);
        return "Deleted";
    }

    @GetMapping("/year")
    public String getDataByYear(@RequestParam(required = true, name = "year")String year) {

        return dataService.accumulate(year);
    }

    @GetMapping("/month")
    public List<String> getDataBy(@RequestParam(required = true, name = "year")String year) {

        return dataService.getByMonthAndYear(year);
    }


    @GetMapping("/list")
    public String getDataBy(@RequestParam(required = true, name = "year")String year, @RequestParam(required = true, name = "month")String month) {

        return dataService.getTotalValuesByYearAndMonth(year, month);
    }

}
