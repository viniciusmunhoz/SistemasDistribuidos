package com.repository;
import com.model.QuadroHorario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadroHorarioRepository extends MongoRepository<QuadroHorario, String> {
}
