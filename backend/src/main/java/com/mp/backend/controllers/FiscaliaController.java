package com.mp.backend.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mp.backend.models.FiscaliaModel;
import com.mp.backend.services.FiscaliaService;

@RestController
@RequestMapping("/fiscalias")
public class FiscaliaController {
    @Autowired
    FiscaliaService fiscaliaService;

    @GetMapping
    public ArrayList<FiscaliaModel> getAllFiscalias() {
        return fiscaliaService.getAll();
    }

    @PostMapping
    public FiscaliaModel saveFiscalia(@RequestBody FiscaliaModel fiscalia) {
        return fiscaliaService.saveFiscalia(fiscalia);
    }

    @GetMapping(path = "/{id}")
    public Optional<FiscaliaModel> getFiscaliaById(@PathVariable("id") Long id) {
        return fiscaliaService.findByPrimaryId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteFiscaliaById(@PathVariable("id") Long id) {
        boolean deleted = fiscaliaService.deleteFiscalia(id);
        if (deleted) {
            return "Fiscalia deleted successfully ID " + id;
        } else {
            return "Error deleting fiscalia ID " + id;
        }
    }
}
