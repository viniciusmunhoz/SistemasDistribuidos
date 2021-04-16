package com.controller;

import com.constant.Constant;
import com.model.Medicamento;
import com.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @PostMapping(Constant.API_CLIENT)
    public void save(@RequestBody Medicamento Medicamento){
        medicamentoService.save(Medicamento);
    }

    @GetMapping(Constant.API_CLIENT)
    public List<Medicamento> findAll(){
        return medicamentoService.findAll();
    }

    @PutMapping(Constant.API_CLIENT)
    public void update(@RequestBody Medicamento Medicamento){
        medicamentoService.save(Medicamento);
    }

    @DeleteMapping(Constant.API_CLIENT + "/{id}")
    public void delete(@PathVariable("id") String id){
        medicamentoService.delete(id);
    }

    @GetMapping(Constant.API_CLIENT + "/{id}")
    public Optional<Medicamento> findById(@PathVariable("id") String id){
        return medicamentoService.findById(id);
    }
}
