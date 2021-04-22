package com.controller;

import com.constant.Constant;
import com.model.Cidade;
import com.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @PostMapping(Constant.API_CIDADE)
    public void save(@RequestBody Cidade cidade){
        cidadeService.save(cidade);
    }

    @GetMapping(Constant.API_CIDADE)
    public List<Cidade> findAll(){
        return cidadeService.findAll();
    }

    @PutMapping(Constant.API_CIDADE)
    public void update(@RequestBody Cidade cidade){
        cidadeService.save(cidade);
    }

    @DeleteMapping(Constant.API_CIDADE + "/{id}")
    public void delete(@PathVariable("id") String id){
        cidadeService.delete(id);
    }

    @GetMapping(Constant.API_CIDADE + "/{id}")
    public Optional<Cidade> findById(@PathVariable("id") String id){
        return cidadeService.findById(id);
    }
}
