package com.service;

import com.model.QuadroHorario;
import com.repository.QuadroHorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuadroHorarioService {
    @Autowired
    private QuadroHorarioRepository quadroHorarioRepository;

    public void save(QuadroHorario quadroHorario){
        quadroHorarioRepository.save(quadroHorario);
    }

    public List<QuadroHorario> findAll(){
        return quadroHorarioRepository.findAll();
    }

    public Optional<QuadroHorario> findById(String id){
        return quadroHorarioRepository.findById(id);
    }

    public void delete(String id){
        quadroHorarioRepository.deleteById(id);
    }
}
