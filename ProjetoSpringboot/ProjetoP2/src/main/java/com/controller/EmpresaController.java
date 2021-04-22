package com.controller;

import com.constant.Constant;
import com.model.Empresa;
import com.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping(Constant.API_EMPRESA)
    public void save(@RequestBody Empresa empresa){
        empresaService.save(empresa);
    }

    @GetMapping(Constant.API_EMPRESA)
    public List<Empresa> findAll(){
        return empresaService.findAll();
    }

    @PutMapping(Constant.API_EMPRESA)
    public void update(@RequestBody Empresa empresa){
        empresaService.save(empresa);
    }

    @DeleteMapping(Constant.API_EMPRESA + "/{id}")
    public void delete(@PathVariable("id") String id){
        empresaService.delete(id);
    }

    @GetMapping(Constant.API_EMPRESA + "/{id}")
    public Optional<Empresa> findById(@PathVariable("id") String id){
        return empresaService.findById(id);
    }
}
