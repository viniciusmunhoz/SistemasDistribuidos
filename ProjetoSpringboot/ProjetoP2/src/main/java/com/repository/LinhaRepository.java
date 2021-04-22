package com.repository;
import com.model.Linha;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhaRepository extends MongoRepository<Linha, String> {
}
