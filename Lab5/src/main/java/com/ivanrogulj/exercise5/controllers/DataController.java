package com.ivanrogulj.exercise5.controllers;

import com.ivanrogulj.exercise5.entitites.Client;
import com.ivanrogulj.exercise5.entitites.Data;
import com.ivanrogulj.exercise5.services.DataService;
import net.bytebuddy.asm.Advice;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/data")
public class DataController {


    private DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;

    }

    @PostMapping("")
    ResponseEntity<String> saveData(@RequestBody Data data, @RequestParam(required = true, name = "deviceId")@NotNull @NumberFormat(style = NumberFormat.Style.NUMBER) long id) {

        String status = dataService.saveData(data,id);
        if(status.contains("Error!"))
        {
            return new ResponseEntity<>(status, HttpStatus.FORBIDDEN);
        }
        else
        {
            return new ResponseEntity<>(status, HttpStatus.OK);
        }
    }


    @GetMapping("")
    ResponseEntity<Data> getData(@RequestParam(required = true, name = "dataId")long id) {

        return  new ResponseEntity<>(dataService.getDataById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    ResponseEntity <List<Data>> getAllData()
    {
        return new ResponseEntity<> (dataService.getAllData(),HttpStatus.OK);
    }

    @PutMapping("")
    ResponseEntity<Data>
    updateData(@RequestBody Data data,
               @RequestParam(required = true, name = "dataId")long id)
    {
        return new ResponseEntity<>(dataService.updateData(data, id),HttpStatus.OK);
    }


    @DeleteMapping("")
    ResponseEntity<String> deleteDataById(@RequestParam(required = true, name = "dataId")long id)
    {
        dataService.deleteDataById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/filter")
    ResponseEntity<List<String>> filterData(@RequestParam Map<String,String> searchParams) {

        List<String> result = dataService.filterData((searchParams));
        if(result.contains("Bad request"))
        {
            return new ResponseEntity<>(result,HttpStatus.BAD_REQUEST);
        }
        else
        {
            return new ResponseEntity<>(dataService.filterData(searchParams),HttpStatus.OK);
        }


    }

}
