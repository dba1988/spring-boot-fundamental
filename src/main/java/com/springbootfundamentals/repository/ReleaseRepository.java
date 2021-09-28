package com.springbootfundamentals.repository;

import com.springbootfundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release,Long> {
}
