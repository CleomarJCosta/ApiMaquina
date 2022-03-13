package com.cleomar.ApiMaquina.Repository;

import com.cleomar.ApiMaquina.Entity.Maquina;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface MaquinaRepository extends MongoRepository<Maquina, Long> {
}
