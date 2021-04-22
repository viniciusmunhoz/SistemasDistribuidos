package com.controller;

import com.constant.Constant;
import com.model.Itinerario;
import com.service.ItinerarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItinerarioController {
    @Autowired
    private ItinerarioService itinerarioService;

    @PostMapping(Constant.API_ITINERARIO)
    public void save(@RequestBody Itinerario itinerario){
        itinerarioService.save(itinerario);
    }

    @GetMapping(Constant.API_ITINERARIO)
    public List<Itinerario> findAll(){
        return itinerarioService.findAll();
    }

    @PutMapping(Constant.API_ITINERARIO)
    public void update(@RequestBody Itinerario itinerario){
        itinerarioService.save(itinerario);
    }

    @DeleteMapping(Constant.API_ITINERARIO + "/{id}")
    public void delete(@PathVariable("id") String id){
        itinerarioService.delete(id);
    }

    @GetMapping(Constant.API_ITINERARIO + "/{id}")
    public Optional<Itinerario> findById(@PathVariable("id") String id){
        return itinerarioService.findById(id);
    }
}
