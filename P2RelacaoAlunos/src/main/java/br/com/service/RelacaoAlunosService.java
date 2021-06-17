package br.com.service;

import br.com.model.RelacaoAlunos;
import br.com.rabbit.RelacaoAlunosProducer;
import br.com.repository.RelacaoAlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelacaoAlunosService {

    @Autowired
    private RelacaoAlunosRepository relacaoalunosRepository;

    @Autowired
    private RelacaoAlunosProducer relacaoalunosProducer;

    public void sendRelacaoAlunosRabbit(RelacaoAlunos RelacaoAlunos){
        relacaoalunosProducer.send(RelacaoAlunos);
    }

    public void save(RelacaoAlunos RelacaoAlunos){
        relacaoalunosRepository.save(RelacaoAlunos);
    }

    public List<RelacaoAlunos> findAll (){
        return relacaoalunosRepository.findAll();
    }

    public Optional<RelacaoAlunos> findById(String id){
        return relacaoalunosRepository.findById(id);
    }

    public void delete(String id){
        relacaoalunosRepository.deleteById(id);
    }

    public void deleteAll(){
        relacaoalunosRepository.deleteAll();
    }
}




