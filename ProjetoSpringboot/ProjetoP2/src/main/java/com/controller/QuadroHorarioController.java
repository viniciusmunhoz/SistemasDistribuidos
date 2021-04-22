package com.controller;
import com.constant.Constant;
import com.model.QuadroHorario;
import com.service.QuadroHorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class QuadroHorarioController {
    @Autowired
    private QuadroHorarioService quadroHorarioService;

    @PostMapping(Constant.API_QUADROHORARIO)
    public void save(@RequestBody QuadroHorario quadroHorario){
        quadroHorarioService.save(quadroHorario);
    }

    @GetMapping(Constant.API_QUADROHORARIO)
    public List<QuadroHorario> findAll(){
        return quadroHorarioService.findAll();
    }

    @PutMapping(Constant.API_QUADROHORARIO)
    public void update(@RequestBody QuadroHorario quadroHorario){
        quadroHorarioService.save(quadroHorario);
    }

    @DeleteMapping(Constant.API_QUADROHORARIO + "/{id}")
    public void delete(@PathVariable("id") String id){
        quadroHorarioService.delete(id);
    }

    @GetMapping(Constant.API_QUADROHORARIO + "/{id}")
    public Optional<QuadroHorario> findById(@PathVariable("id") String id){
        return quadroHorarioService.findById(id);
    }
}
