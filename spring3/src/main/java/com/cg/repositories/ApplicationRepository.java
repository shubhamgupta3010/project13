package com.cg.repositories;

import org.springframework.data.repository.CrudRepository;
import com.cg.entities.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
