package com.service;

import com.model.Cidade;
import com.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public void save(Cidade cidade){
        cidadeRepository.save(cidade);
    }

    public List<Cidade> findAll(){
        return cidadeRepository.findAll();
    }

    public Optional<Cidade> findById(String id){
        return cidadeRepository.findById(id);
    }

    public void delete(String id){
        cidadeRepository.deleteById(id);
    }
}
