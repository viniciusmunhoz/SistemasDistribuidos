package com.service;

import com.model.Itinerario;
import com.repository.ItinerarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItinerarioService {
    @Autowired
    private ItinerarioRepository itinerarioRepository;

    public void save(Itinerario itinerario){
        itinerarioRepository.save(itinerario);
    }

    public List<Itinerario> findAll(){
        return itinerarioRepository.findAll();
    }

    public Optional<Itinerario> findById(String id){
        return itinerarioRepository.findById(id);
    }

    public void delete(String id){
        itinerarioRepository.deleteById(id);
    }
}
