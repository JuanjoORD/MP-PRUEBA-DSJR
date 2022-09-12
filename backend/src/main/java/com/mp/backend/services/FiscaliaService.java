package com.mp.backend.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mp.backend.models.FiscaliaModel;
import com.mp.backend.repositories.FiscaliaRepository;

@Service
public class FiscaliaService {
    @Autowired
    FiscaliaRepository fiscaliaRepository;

    public ArrayList<FiscaliaModel> getAll() {
        return (ArrayList<FiscaliaModel>) fiscaliaRepository.findAll();
    }

    public FiscaliaModel saveFiscalia(FiscaliaModel fiscalia) {
        return fiscaliaRepository.save(fiscalia);
    }

    public Optional<FiscaliaModel> findByPrimaryId(Long id) {
        return fiscaliaRepository.findById(id);
    }

    public boolean deleteFiscalia(long id) {
        try {
            fiscaliaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}
