package com.mp.backend.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mp.backend.models.FiscaliaModel;

@Repository
public interface FiscaliaRepository extends CrudRepository<FiscaliaModel, Long> {
    // public abstract ArrayList<FiscaliaModel> findById(Integer id);
}
