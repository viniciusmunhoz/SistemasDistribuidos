package br.com.controller;

import br.com.constant.Constant;
import br.com.model.RelacaoAlunos;
import br.com.service.RelacaoAlunosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.Cacheable;

import java.util.List;
import java.util.Optional;

@RestController
public class RelacaoAlunosController {

    @Autowired
    private RelacaoAlunosService relacaoalunosService;

    @PostMapping(Constant.API_RELACAOALUNOS)
    public void save(@RequestBody RelacaoAlunos relacaoAlunos){
        relacaoalunosService.sendRelacaoAlunosRabbit(relacaoAlunos);
    }

    @GetMapping(Constant.API_RELACAOALUNOS)
    public List<RelacaoAlunos> findAll(){
        return relacaoalunosService.findAll();
    }

    @PutMapping(Constant.API_RELACAOALUNOS)
    public void update (@RequestBody RelacaoAlunos relacaoAlunos){
        relacaoalunosService.save(relacaoAlunos);
    }

    @DeleteMapping(Constant.API_RELACAOALUNOS + "/{id}")
    public void delete(@PathVariable("id") String id){
        relacaoalunosService.delete(id);
    }

    @GetMapping(Constant.API_RELACAOALUNOS + "/{id}")
    @Cacheable("relacaoalunos")
    public Optional<RelacaoAlunos> findById(@PathVariable("id") String id){
        System.out.println("Find Information.. " + id);
        return relacaoalunosService.findById(id);
    }

}




