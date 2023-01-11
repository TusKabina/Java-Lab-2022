package com.ivanrogulj.vjezba6.Testiranje;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivanrogulj.vjezba6.entitites.Data;
import com.ivanrogulj.vjezba6.entitites.Example;
import com.ivanrogulj.vjezba6.entitites.SubmitData;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.http.HttpMethod;

@org.springframework.stereotype.Controller
public class Controller {


  RestTemplate restTemplate = new RestTemplate();

  @GetMapping("/")
  public String home(@RequestParam Map<String, String> params, Model model) {
    int offset;
    int pageSize;
    String sortBy;
    if (params.containsKey("offset")) {
      offset = Integer.parseInt(params.get("offset"));
    }
    else
    {
      offset = 0;
    }
    if (params.containsKey("pageSize")) {
      pageSize = Integer.parseInt(params.get("pageSize"));
    }
    else
    {
      pageSize = 5;
    }
    if (params.containsKey("sort")) {
      sortBy = params.get("sort");
    }
    else
    {
      sortBy = "month";
    }
    String uri = "http://localhost:8080/data/all?page=" + offset + "&size=" + pageSize + "&sortBy=" + sortBy;
    Example example = restTemplate.getForObject(uri, Example.class);
    model.addAttribute("content", example.getContent());
    model.addAttribute("totalElementNumber", example.getTotalElements());
    model.addAttribute("totalPageNumber", example.getTotalPages());
    model.addAttribute("pageNumber", offset);
    model.addAttribute("currentSortBy", sortBy);
    return "index";
  }

  @GetMapping("/submit_data")
  public String deviceDataForm(Model model) {
    model.addAttribute("data", new SubmitData());

    return "add_data";
  }

  @PostMapping(value = "/submit_data")
  public String deviceDataForm(@ModelAttribute SubmitData submitData) throws JsonProcessingException {

    Data deviceData = new Data(null,submitData.getValue(),submitData.getMonth(),submitData.getYear());

    System.out.println("DEVICE DATA: "+deviceData );


   // restTemplate.postForEntity("http://localhost:8080/data?deviceId="+submitData.getClientId(), deviceData, Data.class);


    ObjectMapper mapper = new ObjectMapper();
    String jsonString = mapper.writeValueAsString(deviceData);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<String> request = new HttpEntity<>(jsonString, headers);
    restTemplate.exchange("http://localhost:8080/data?deviceId="+submitData.getClientId(), HttpMethod.POST, request, String.class);

    return "redirect:/";


  }


}
