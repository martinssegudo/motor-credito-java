package br.com.motor.repositories;

import br.com.motor.repositories.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Long, PersonEntity> {
}
