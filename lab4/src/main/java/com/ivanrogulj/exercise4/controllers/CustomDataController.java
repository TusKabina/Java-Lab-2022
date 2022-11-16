package com.ivanrogulj.exercise4.controllers;

import com.ivanrogulj.exercise4.entitites.Data;
import com.ivanrogulj.exercise4.services.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/getDataBy")
public class CustomDataController {


    private DataService dataService;

    public CustomDataController(DataService dataService) {
        this.dataService = dataService;
    }


    @GetMapping("/year/{year}")
    public String getDataByYear(@PathVariable("year")String year) {

        return dataService.accumulate(year);
    }

    @GetMapping("/month/{year}")
    public List<String> getDataBy(@PathVariable("year")String year) {

        return dataService.getByMonthAndYear(year);
    }

}
