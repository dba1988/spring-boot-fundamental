package com.springbootfundamentals.web;


import com.springbootfundamentals.entity.Application;
import com.springbootfundamentals.exception.ApplicationNotFoundException;
import com.springbootfundamentals.service.IApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class restController {
    private final IApplicationService iApplicationService;


    public restController(IApplicationService iApplicationService) {
        this.iApplicationService = iApplicationService;
    }
    @GetMapping("/applications")
    public Iterable<Application> getAllApplication(){
        return iApplicationService.listApplications();
    }
//    @GetMapping("/applications/{id}")
//    public Optional<Application> getApplicationById(@PathVariable("id") long id){
//        return iApplicationService.getApplicationById(id);
//    }
@GetMapping("/application/{id}")
public ResponseEntity<Application> getApplication(@PathVariable("id") int id) {
    try {
        return new ResponseEntity<>(iApplicationService.findApplication(id),
                HttpStatus.OK);
    } catch (ApplicationNotFoundException exception) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
    }
}
}
