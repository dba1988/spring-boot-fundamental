package com.springbootfundamentals.service;

import com.springbootfundamentals.entity.Application;

import java.util.Optional;

public interface IApplicationService {
    Iterable<Application> listApplications();
    //Optional<Application> getApplicationById(long id);
    Application findApplication(int id);
}
