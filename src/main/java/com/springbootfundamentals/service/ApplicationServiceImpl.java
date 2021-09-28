package com.springbootfundamentals.service;

import com.springbootfundamentals.entity.Application;
import com.springbootfundamentals.exception.ApplicationNotFoundException;
import com.springbootfundamentals.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationServiceImpl implements IApplicationService {
    @Autowired
    private  ApplicationRepository applicationRepository;

    public Iterable<Application> listApplications(){
       return  applicationRepository.findAll();
    }

    //@Override
    //public Optional<Application> getApplicationById(long id) {
   //     return applicationRepository.findById(id);
   // }

    public Application findApplication(int id) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);

        if(optionalApplication.isPresent())
            return optionalApplication.get();
        else
            throw new ApplicationNotFoundException("Application Not Found");
    }

}
