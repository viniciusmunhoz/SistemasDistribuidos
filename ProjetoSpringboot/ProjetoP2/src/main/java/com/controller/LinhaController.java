package com.controller;

import com.constant.Constant;
import com.model.Linha;
import com.service.LinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LinhaController {
    @Autowired
    private LinhaService linhaService;

    @PostMapping(Constant.API_LINHA)
    public void save(@RequestBody Linha linha){
        linhaService.save(linha);
    }

    @GetMapping(Constant.API_LINHA)
    public List<Linha> findAll(){
        return linhaService.findAll();
    }

    @PutMapping(Constant.API_LINHA)
    public void update(@RequestBody Linha linha){
        linhaService.save(linha);
    }

    @DeleteMapping(Constant.API_LINHA + "/{id}")
    public void delete(@PathVariable("id") String id){
        linhaService.delete(id);
    }

    @GetMapping(Constant.API_LINHA + "/{id}")
    public Optional<Linha> findById(@PathVariable("id") String id){
        return linhaService.findById(id);
    }
}
