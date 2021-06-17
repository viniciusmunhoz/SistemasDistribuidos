package br.com.repository;

import br.com.model.RelacaoAlunos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelacaoAlunosRepository extends MongoRepository <RelacaoAlunos, String> {
}



