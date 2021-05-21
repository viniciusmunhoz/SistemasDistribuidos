package vinicius.repository;

import vinicius.model.Compra;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends MongoRepository<Compra, String> {
}
