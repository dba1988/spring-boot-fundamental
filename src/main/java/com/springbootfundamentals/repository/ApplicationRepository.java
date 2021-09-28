package com.springbootfundamentals.repository;

import com.springbootfundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application,Integer> {
}
