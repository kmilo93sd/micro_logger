package cl.getcolors.loggerservice.controllers;

import cl.getcolors.loggerservice.entities.Log;
import cl.getcolors.loggerservice.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowLogsController {

    private LogRepository logRepository;

    @Autowired
    public ShowLogsController(LogRepository logRepository){
        this.logRepository = logRepository;
    }

    @GetMapping("/logs/{serviceId}")
    public Log byServiceId(@PathVariable String serviceId){
        return this.logRepository.findByServiceId(serviceId);
    }
}
