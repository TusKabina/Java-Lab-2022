package com.ivanrogulj.exercise5.controllers;

import com.ivanrogulj.exercise5.entitites.Client;
import com.ivanrogulj.exercise5.entitites.Data;
import com.ivanrogulj.exercise5.exceptionHandler.BadRequestException;
import com.ivanrogulj.exercise5.exceptionHandler.DataNotFoundException;
import com.ivanrogulj.exercise5.services.DataService;
import net.bytebuddy.asm.Advice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
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
    ResponseEntity<String> saveData(@RequestBody Data data, @RequestParam(required = true, name = "deviceId") @NotNull @NumberFormat(style = NumberFormat.Style.NUMBER) long id) {

        String status = dataService.saveData(data, id);
        if (status.contains("Error!")) {
            return new ResponseEntity<>(status, HttpStatus.FORBIDDEN);
        } else {
            try {

                return new ResponseEntity<>(status, HttpStatus.OK);

            } catch (BadRequestException e) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }
        }
    }


    @GetMapping("")
    ResponseEntity<Data> getData(@RequestParam(required = true, name = "dataId") long id) {
        try {
            return new ResponseEntity<>(dataService.getDataById(id), HttpStatus.OK);
        } catch (DataNotFoundException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/all")
    public ResponseEntity<Page<Data>> getAllData(@PageableDefault(page = 1, size = 5) Pageable pageable,
                                                 @RequestParam(required = false) String sortBy) {
        Sort sort = Sort.by(sortBy);
        Pageable sortPage = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
        try {
            return new ResponseEntity<>(dataService.getAllData(sortPage), HttpStatus.OK);
        } catch (DataNotFoundException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("")
    ResponseEntity<Data>
    updateData(@RequestBody Data data,
               @RequestParam(required = true, name = "dataId") long id) {
        try {

            return new ResponseEntity<>(dataService.updateData(data, id), HttpStatus.OK);

        } catch (DataNotFoundException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("")
    ResponseEntity<String> deleteDataById(@RequestParam(required = true, name = "dataId") long id) {
        try {
            dataService.deleteDataById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (DataNotFoundException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/filter")
    ResponseEntity<List<String>> filterData(@RequestParam Map<String, String> searchParams) {

        List<String> result = dataService.filterData((searchParams));
        if (result.contains("Bad request")) {
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        } else {
            try {
                return new ResponseEntity<>(dataService.filterData(searchParams), HttpStatus.OK);
            } catch (DataNotFoundException e) {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }


        }

    }
}
