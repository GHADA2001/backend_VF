package com.fsb.eblood.web.controller;


import com.fsb.eblood.dao.entities.Alert;
import com.fsb.eblood.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alert")
public class AlertController {

    @Autowired
    private AlertService alertService;

    @PostMapping("/save")
    public Alert saveAlert(@RequestBody Alert alert){
        return alertService.saveAlert(alert);
    }

    @PostMapping("/update")
    public Alert updateAlert(@RequestBody Alert alert)
    { return alertService.updateAlert(alert);}

    @GetMapping("/get/{description}")
    public List<Alert> getAlert(@PathVariable("description") String description){
        return alertService.getAlert(description);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        alertService.deleteAlert(id);
    }
    @GetMapping("/getAll")
    public List<Alert> getAll(){
       return alertService.getAll();
    }

}
