package cl.getcolors.loggerservice.controllers;

import cl.getcolors.loggerservice.entities.Log;
import cl.getcolors.loggerservice.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateLogController {

    private LogRepository logRepository;

    @Autowired
    public CreateLogController(LogRepository logRepository){
        this.logRepository = logRepository;
    }

    @PostMapping("/logs")
    public void createLog(@RequestBody Log log) {
        this.logRepository.save(log);
    }
}
