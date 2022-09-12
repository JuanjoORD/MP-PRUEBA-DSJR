package com.mp.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mp.backend.models.FiscaliaModel;

@Repository
public interface FiscaliaRepository extends CrudRepository<FiscaliaModel, Long> {
    
}
