package com.repository;
import com.model.Itinerario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItinerarioRepository extends MongoRepository<Itinerario, String>{
}
