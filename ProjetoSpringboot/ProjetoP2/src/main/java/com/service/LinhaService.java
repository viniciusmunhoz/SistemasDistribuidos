package com.service;

import com.model.Linha;
import com.repository.LinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinhaService {
    @Autowired
    private LinhaRepository linhaRepository;

    public void save(Linha linha){
        linhaRepository.save(linha);
    }

    public List<Linha> findAll(){
        return linhaRepository.findAll();
    }

    public Optional<Linha> findById(String id){
        return linhaRepository.findById(id);
    }

    public void delete(String id){
        linhaRepository.deleteById(id);
    }
}
