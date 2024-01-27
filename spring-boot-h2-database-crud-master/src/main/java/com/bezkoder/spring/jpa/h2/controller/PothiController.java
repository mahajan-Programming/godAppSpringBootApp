package com.bezkoder.spring.jpa.h2.controller;

import com.bezkoder.spring.jpa.h2.Service.PothiService;
import com.bezkoder.spring.jpa.h2.dto.DataRequestResponse;
import com.bezkoder.spring.jpa.h2.dto.DeleteIdObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pothiController")
public class PothiController {

    @GetMapping("/health")
    public String heatth(){
        return "running...!";
    }

    @Autowired
    PothiService pothiService;
    @PostMapping("/addOrUpdateUser")
    public String addOrUpdateUser(@RequestBody DataRequestResponse request){
        pothiService.newnewaddOrUpdateUser(request);
        return "added successfully!";
    }

    @PostMapping("/addOrUpdateBucket")
    public String addOrUpdateBucket(@RequestBody DataRequestResponse request){
        pothiService.addOrUpdateBucket(request);
        return "added successfully!";
    }

    @PostMapping("/addOrUpdateSection")
    public String addOrUpdateSection(@RequestBody DataRequestResponse request){
        pothiService.addOrUpdateSection(request);
        return "added successfully!";
    }

    @PostMapping("/addOrUpdateContent")
    public String addOrUpdateContent(@RequestBody DataRequestResponse request){
        pothiService.addOrUpdateContent(request);
        return "added successfully!";
    }

    @GetMapping("/getAllPothis")
    public DataRequestResponse getAllData(){
        return pothiService.getAllData();
    }

    @DeleteMapping("/deleteAllPothis")
    public String deleteAllPothi(){
        pothiService.deleteAllPothis();
        return "deleted";
    }

    @DeleteMapping("/deleteId")
    public String deleteId(@RequestBody DeleteIdObj deleteIdObj){
        pothiService.deleteId(deleteIdObj);
        return "deleted";
    }
}
