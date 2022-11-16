package com.ivanrogulj.exercise4.controllers;

import com.ivanrogulj.exercise4.entitites.Client;
import com.ivanrogulj.exercise4.entitites.Data;
import com.ivanrogulj.exercise4.entitites.dto.ClientDTO;
import com.ivanrogulj.exercise4.services.DataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {


    private DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }


    @PostMapping("/{id}")
    public Data saveData(@RequestBody Data data,  @PathVariable("id")long id) {
        return dataService.saveData(data,id);

    }

    @GetMapping("/{id}")
    public Data getData(@PathVariable("id")long id) {

        return dataService.getDataById(id);
    }

    @GetMapping("/")
    private List<Data> getAllData()
    {
        return dataService.getAllData();
    }

    @PutMapping("/{id}")

    public Data
    updateData(@RequestBody Data data,
                     @PathVariable("id") long id)
    {
        return dataService.updateData(
                data, id);
    }

    public String accumulate(String year)
    {
        return dataService.accumulate(year);
    }



}
