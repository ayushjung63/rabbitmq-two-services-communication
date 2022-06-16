package com.ayush.emailproducer.controller;


import com.ayush.emailproducer.entities.Data;
import com.ayush.emailproducer.service.DataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {
    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping("/send")
    public ResponseEntity send(@RequestBody Data data){
        Long response = dataService.sendData(data);
        if (response>0){
            return ResponseEntity.ok("Data Sent Successfully");
        }else{
            return ResponseEntity.ok("Could not Sent Data.");
        }
    }
}
